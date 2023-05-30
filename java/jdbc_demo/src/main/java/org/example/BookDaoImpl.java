package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao{
    private static final String INSERT_QUERY = " INSERT INTO BOOKS " +
            " (BOOK_ID,AUTHOR_ID,BOOK_NAME) " +
            " VALUES (?, ?, ?)";
    private static final String READ_BY_ID = " SELECT * FROM BOOKS WHERE BOOK_ID = ? ";
    private static final String READ_ALL = " SELECT * FROM BOOKS ";
    private static final String UPDATE_QUERY = " UPDATE BOOKS " +
            " SET BOOK_ID = ?," +" SET AUTHOR_ID = ?," +
            " BOOK_NAME = ? WHERE BOOK_ID = ? ";
    private static final String DELETE_QUERY = " DELETE FROM BOOKS WHERE BOOK_ID = ? ";

    @Override
    public int create(Book book) {
    int result;
    try(Connection connection = DbConnection.getConnection()){
        connection.setAutoCommit(false);
        PreparedStatement prepareStatement = connection.prepareStatement(INSERT_QUERY);
        prepareStatement.setInt(1,book.getBookId());
        prepareStatement.setInt(2,book.getAuthorID());
        prepareStatement.setString(3,book.getBookName());
        result=prepareStatement.executeUpdate();
        prepareStatement.close();
        connection.commit();


    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
    return result;
    }

    @Override
    public Book read(int bookId) throws SQLException {
        Book book=null;
        try(Connection connection= DbConnection.getConnection()) {
            PreparedStatement prepareStatement = connection.prepareStatement(READ_BY_ID);
            prepareStatement.setInt(1,bookId);
            ResultSet resultSet=prepareStatement.executeQuery();
            if(resultSet.next()){
                book.setBookId(resultSet.getInt(1));
                book.setAuthorID(resultSet.getInt(2));
                book.setBookName(resultSet.getString(3));
            }
        }catch (SQLException e) {
            System.err.println("Error while connecting to database");
            System.err.println(e.getMessage());
        }
        return book;

    }

    @Override
    public int update(Book book) {
        int result;
        try(Connection connection=DbConnection.getConnection()) {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement=connection.prepareStatement(UPDATE_QUERY);
            preparedStatement.setInt(1,book.getBookId());
            preparedStatement.setInt(2,book.getAuthorID());
            preparedStatement.setString(3,book.getBookName());
            preparedStatement.setInt(4,book.getBookId());
            result=preparedStatement.executeUpdate();
            connection.commit();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    @Override
    public int delete(int BookId) {
        int result=0;
        try(Connection connection=DbConnection.getConnection()) {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY);
            preparedStatement.setInt(1,BookId);
            preparedStatement.executeQuery();
            connection.commit();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    @Override
    public List<Book> readAll() throws SQLException {
        List<Book>res=new ArrayList<>();
        try(Connection connection=DbConnection.getConnection()){
            PreparedStatement prepareStatement = connection.prepareStatement(READ_ALL);
            ResultSet resultSet=prepareStatement.executeQuery();
            while (resultSet.next()){
                Book b=new Book();
                b.setBookId(resultSet.getInt(1));
                b.setAuthorID(resultSet.getInt(2));
                b.setBookName(resultSet.getString(3));
                res.add(b);
            }
            return res;
        }
    }
}
