package org.example;

import java.sql.SQLException;
import java.util.List;

public interface BookDao  {
    int create(Book book);

    Book read(int bookId) throws SQLException;
    List<Book>readAll() throws SQLException;

    int update(Book book);

    int delete(int BookId);
}
