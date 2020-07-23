package za.co.bookstore.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="bookAuthor")
@ToString
@Getter
@Setter
public class BookAuthorDao {

    @Id
    private Long bookAuthorId;

    @ManyToOne
    @JoinColumn(name = "bookId")
    private BookDao book;

    @ManyToOne
    @JoinColumn(name = "authorId")
    private AuthorDao author;

}
