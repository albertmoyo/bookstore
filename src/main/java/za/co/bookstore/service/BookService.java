package za.co.bookstore.service;

import za.co.bookstore.data.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();

    Book findBookById(long bookId);

    Book addBook(Book book);

    void deleteBook(long id);

    Book updateBook(Book book);


}
