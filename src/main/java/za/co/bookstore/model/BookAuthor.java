package za.co.bookstore.model;

import lombok.Builder;
import lombok.Data;
import za.co.bookstore.data.BookAuthorDao;

@Data
@Builder(builderClassName = "BookAuthorBuilder")
public class BookAuthor {

    private Long bookAuthorId;

    private Book book;

    private Author author;

    public static class BookAuthorBuilder {
        public BookAuthor.BookAuthorBuilder fromAuthorDao(BookAuthorDao bookAuthorDao) {
            return bookAuthorId(bookAuthorDao.getBookAuthorId())
                    .book(Book.builder().fromBookDao(bookAuthorDao.getBook()).build())
                    .author(Author.builder().fromAuthorDao(bookAuthorDao.getAuthor()).build());
        }
    }

}
