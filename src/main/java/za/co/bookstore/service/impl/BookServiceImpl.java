package za.co.bookstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import lombok.var;
import za.co.bookstore.data.BookDao;
import za.co.bookstore.data.repository.AuthorRepository;
import za.co.bookstore.data.repository.BookRepository;
import za.co.bookstore.exception.BookResourceNotFoundException;
import za.co.bookstore.model.Author;
import za.co.bookstore.model.Book;
import za.co.bookstore.service.BookService;

@Service
@Slf4j
public class BookServiceImpl implements BookService {
    BookRepository bookRepository;
    AuthorRepository authorRepository;
    @Autowired
    public BookServiceImpl(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        val bookDaoList = bookRepository.findAll();
        val bookList = new ArrayList<Book>();
        bookDaoList.forEach(it -> bookList.add(Book.builder().fromBookDao( it).build()));
        return bookList;
    }
//
//    @Override
//    public Book findByBookId(Integer bookId, List<Author> author) {
//        var book = bookRepository.findById(bookId);
//
//        if (null == book) {
//            throw new BookResourceNotFoundException("Book with id: " + bookId + " not found");
//        }
//
//
//        return null;
//    }
//
//    @Override
//    public Book addBook(Book book) {
//      //  bookRepository.saveAndFlush(book);
//        return book;
//
//    }

//    @Override
//    public void deleteBook(Integer bookId) {
//        //
//        var book = bookRepository.findById(bookId);
//
//        if (null == book) {
//            throw new BookResourceNotFoundException("Book with id: " + bookId + " not found");
//        }
//
//    }

//    @Override
//    public Book updateBook(Integer bookId) {
//        //find book by id
//        //allow to update fields
//        //Save to database
//        BookDao bookDao = bookRepository.findById(bookId).get();
//
//        bookRepository.saveAndFlush(bookDao);
//
//        //byId.filter()
//        return null;
//
//    }
}
