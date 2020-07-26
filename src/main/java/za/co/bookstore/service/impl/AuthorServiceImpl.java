package za.co.bookstore.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.bookstore.data.Author;
import za.co.bookstore.data.repository.AuthorRepository;
import za.co.bookstore.service.AuthorService;

import java.util.List;

@Service
@Slf4j
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> getAllAuthors() {
        log.info("Getting all authors");
        return authorRepository.findAll();
    }

    @Override
    public Author findById(long authorId) {
        return authorRepository.getOne(authorId);
    }

    @Override
    public void addAuthor(Author author) {
        //use this for a POST
        authorRepository.saveAndFlush(author);
        log.info("Successfully added author: {} ", author);

    }

    @Override
    public void deleteAuthor(long id) {
        authorRepository.deleteById(id);
        log.info("Successfully deleted author with id: {} ", id);
    }

    @Override
    public void updateAuthor(long id) {
        //TODO
    }
}
