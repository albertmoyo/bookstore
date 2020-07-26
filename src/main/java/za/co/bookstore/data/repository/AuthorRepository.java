package za.co.bookstore.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.bookstore.data.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
