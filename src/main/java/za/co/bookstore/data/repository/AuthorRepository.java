package za.co.bookstore.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import za.co.bookstore.data.AuthorDao;

public interface  AuthorRepository extends JpaRepository<AuthorDao, Long> {
    List<AuthorDao> findByAuthorId(int authorId);

    @Override
    AuthorDao saveAndFlush(AuthorDao authorDao);

}
