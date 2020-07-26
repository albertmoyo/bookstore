package za.co.bookstore.service;

import za.co.bookstore.data.Author;

import java.util.List;

public interface AuthorService {
    List<Author> getAllAuthors();

    Author findById(long authorId);

    void addAuthor(Author author);

    void deleteAuthor(long id);

    void updateAuthor(long id);
}
