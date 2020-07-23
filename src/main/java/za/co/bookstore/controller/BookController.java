package za.co.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import za.co.bookstore.model.Book;
import za.co.bookstore.service.BookService;

@CrossOrigin
@RestController
//@Timed
@Slf4j
public class BookController {
    BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(value = "/v1/books",  produces="application/json")
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok(bookService.getAllBooks());
    }

//    @GetMapping(value = "/books/{bookId}", produces = "application/json")
//    public ResponseEntity<Book> findBook(@PathVariable Integer bookId) {
//
//        return ResponseEntity.ok(bookService.findByBookId(bookId));
//    }

//    @PostMapping(value = "/books/{bookId}", consumes = "application/json", produces = "application/json")
//    public ResponseEntity<Book> createBook(@RequestBody Book book) {
//
//        return ResponseEntity.ok(bookService.addBook(book));
//
//    }
//
//    @DeleteMapping("/books/delete/{bookId}")
//    public void deleteBook(@PathVariable Integer id) {
//        bookService.deleteBook(id);
//    }
//
//    @PutMapping(value = "/books/update/{bookId}", produces = "application/json")
//    public void updateBook(@PathVariable Integer id){
//
//        Book book = bookService.updateBook(id);
//
//    }

    //    @PostMapping(value = "/v1/{book-id}/purchase-product",consumes="application/json",
    //            produces="application/json")
    //    public ResponseEntity<List<Product>> purchaseProduct(@PathVariable("{book-id}") int customerId, @RequestBody List<Product> products) {
    //        log.info("requesting product(s): {} for customerId: {}", products, customerId);
    //        return ResponseEntity.ok(activeShoppeService.purchaseProduct(customerId, products));
    //    }


}
