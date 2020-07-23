package za.co.bookstore.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import za.co.bookstore.data.BookDao;


@Data
@Builder(builderClassName = "BookBuilder")
public class Book {
    @NonNull
    private Long bookId;
    @NonNull
    private String title;
    @NonNull
    private double price;
    @NonNull
    private int year;


    public static class BookBuilder {
        public BookBuilder fromBookDao(BookDao bookDao) {
            return bookId(bookDao.getBookId())
                     .title(bookDao.getTitle())
                    .price(bookDao.getPrice())
                    .year(bookDao.getYear());
        }
    }

}
