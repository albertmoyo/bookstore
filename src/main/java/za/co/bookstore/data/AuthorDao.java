package za.co.bookstore.data;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.Set;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import za.co.bookstore.model.Author;
import za.co.bookstore.model.Book;
import za.co.bookstore.model.BookAuthor;

@Entity
@Table(name="author")
@ToString
@Getter
@Setter
public class AuthorDao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="authorId")
    @JsonIgnore
    private Long authorId;

    @Column(name="name")
    private String name;

    @Column(name="bookId")
    private int bookId;

    @OneToMany(mappedBy = "author")
    private Set<BookAuthorDao> bookAuthorSet;

}
