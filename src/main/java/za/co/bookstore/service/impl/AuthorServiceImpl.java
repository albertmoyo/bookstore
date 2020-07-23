package za.co.bookstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import za.co.bookstore.data.repository.AuthorRepository;
import za.co.bookstore.model.Author;
import za.co.bookstore.service.AuthorService;

public class AuthorServiceImpl implements AuthorService {
    AuthorRepository authorRepository;

    @Autowired
    AuthorServiceImpl(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> getAllAuthors(int bookId) {
        return null;
    }

    @Override
    public Author findById(int bookId) {
        return null;
    }

    @Override
    public void addAuthor(Author author) {

    }

    @Override
    public void deleteAuthor(int id) {

    }

    @Override
    public void updateAuthor(int id) {

    }
}
