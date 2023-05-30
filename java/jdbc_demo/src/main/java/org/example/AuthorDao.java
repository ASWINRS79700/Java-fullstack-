package org.example;


import java.util.List;
import java.util.Optional;

public interface AuthorDao {
    int create(Author author);

    Optional<Author> read(int authorId);

    int update(Author author);
    List<Author> readAll();

    int delete(int authorId);

}
