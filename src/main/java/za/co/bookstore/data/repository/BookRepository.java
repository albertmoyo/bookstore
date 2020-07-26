package za.co.bookstore.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.bookstore.data.Book;
public interface BookRepository extends JpaRepository<Book, Long> {
}
