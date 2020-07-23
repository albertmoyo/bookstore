package za.co.bookstore.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
import za.co.bookstore.data.BookAuthorDao;
import za.co.bookstore.data.BookDao;


public interface BookRepository extends JpaRepository<BookDao, Long> {



    List<BookDao> findAll();

    @Query("Select title, year, price from book a  left join bookAuthor b on a.bookId=b.bookId")
     List<BookDao> someQuery();
//
//    @Override
//    Optional<BookDao> findById(Integer integer);
//
//    @Override
//    void deleteById(Integer integer);
//
//    @Override
//    BookDao saveAndFlush(BookDao bookDao);

    //Book addBook(Book book);


}
