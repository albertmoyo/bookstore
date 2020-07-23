package za.co.bookstore.service;

import java.util.List;
import za.co.bookstore.model.Author;


public interface AuthorService {
    List<Author> getAllAuthors(int bookId);

    Author findById(int bookId);

    void addAuthor(Author author);

    void deleteAuthor(int id);

    void updateAuthor(int id);
}
