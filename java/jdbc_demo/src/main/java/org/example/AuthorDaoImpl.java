package org.example;

import java.sql.Connection;
import java.sql.SQLException;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



public class AuthorDaoImpl implements AuthorDao{
    private static final String INSERT_QUERY = """
            INSERT INTO Authors (AUTHOR_ID,AUTHOR_NAME, GENDER, AUTHOR_EMAIL, JOIN_DATE)
            VALUES (?, ?, ?, ?, ?)""";
    private static final String READ_BY_ID = """ 
            SELECT * FROM AUTHORS WHERE AUTHOR_ID = ?""";
    private static final String READ_ALL = """
             SELECT * FROM AUTHORS"""
;
    private static final String UPDATE_QUERY = """
             UPDATE AUTHORS
            SET AUTHOR_NAME = ?, GENDER = ?, AUTHOR_EMAIL = ?,
            JOIN_DATE = ? WHERE AUTHOR_ID = ?"""
;
    private static final String DELETE_QUERY = """
             DELETE FROM AUTHORS WHERE AUTHOR_ID = ?""";

    @Override
    public int create(Author author) {
        int updated = 0;
        try (Connection connection = DbConnection.getConnection()) {

            // disabling the auto commit feature of the JDBC Connection
            connection.setAutoCommit(false);

            PreparedStatement prepareStatement = connection.prepareStatement(INSERT_QUERY);

            prepareStatement.setInt(1, author.getAuthorID());
            prepareStatement.setString(2, author.getAuthorName());
            prepareStatement.setString(3, author.getGender());
            prepareStatement.setString(4, author.getAuthorEmail());
            prepareStatement.setDate(5, Date.valueOf(author.getJoinDate()));
            // prepareStatement.setObject(5, author.getJoinDate());

            updated = prepareStatement.executeUpdate();
            prepareStatement.close();
            // commit the changes to the database
            connection.commit();

        } catch (SQLException e) {
            System.err.println("Error while connecting to database");
            System.err.println(e.getMessage());
        }
        return updated;
    }

    @Override
    public Optional<Author> read(int authorId) {
        Author author = null;
        try (Connection connection = DbConnection.getConnection()) {
            PreparedStatement prepareStatement = connection.prepareStatement(READ_BY_ID);
            prepareStatement.setInt(1, authorId);
            ResultSet resultSet = prepareStatement.executeQuery();
            if (resultSet.next()) {
                author = new Author();
                author.setAuthorID(resultSet.getInt(1));
                author.setAuthorName(resultSet.getString(2));
                author.setGender(resultSet.getString(3));
                author.setAuthorEmail(resultSet.getString(4));
                author.setJoinDate(resultSet.getDate(5).toLocalDate());
            }
            prepareStatement.close();
        } catch (SQLException e) {
            System.err.println("Error while connecting to database");
            System.err.println(e.getMessage());
        }
        return Optional.ofNullable(author);
    }

    @Override
    public int update(Author author) {
        int res;
        try(Connection connection=DbConnection.getConnection()) {
            PreparedStatement preparedStatement=connection.prepareStatement(UPDATE_QUERY);
            preparedStatement.setString(1,author.getAuthorName());
            preparedStatement.setString(2,author.getGender());
            preparedStatement.setString(3,author.getAuthorEmail());
            preparedStatement.setDate(4,Date.valueOf(author.getJoinDate()));
            preparedStatement.setInt(5,author.getAuthorID());
            res=preparedStatement.executeUpdate();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return res;
    }

    @Override
    public int delete(int authorId) {
        // TODO Auto-generated method stub
        int result=0;
        try(Connection connection=DbConnection.getConnection()) {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY);
            preparedStatement.setInt(1,authorId);
            preparedStatement.executeQuery();
            connection.commit();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    @Override
    public List<Author> readAll() {
        List<Author> authors = new ArrayList<>();
        try (Connection connection = DbConnection.getConnection()) {
            PreparedStatement prepareStatement = connection.prepareStatement(READ_ALL);
            ResultSet resultSet = prepareStatement.executeQuery();
            while (resultSet.next()) {
                Author author = new Author();
                author.setAuthorID(resultSet.getInt(1));
                author.setAuthorName(resultSet.getString(2));
                author.setGender(resultSet.getString(3));
                author.setAuthorEmail(resultSet.getString(4));
                author.setJoinDate(resultSet.getDate(5).toLocalDate());
                authors.add(author);
            }
            prepareStatement.close();
        } catch (SQLException e) {
            System.err.println("Error while connecting to database");
            System.err.println(e.getMessage());
        }
        return authors;
    }


}
