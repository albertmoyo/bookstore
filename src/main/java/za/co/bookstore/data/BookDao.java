package za.co.bookstore.data;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.Set;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import za.co.bookstore.model.Author;
import za.co.bookstore.model.BookAuthor;

@Entity
@Table(name="book")
@ToString
@Getter
@Setter
@RequiredArgsConstructor
public class BookDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bookId")
    @JsonIgnore
    private Long bookId;

    @Column(name="title")
    private String title;

    @Column(name="year")
    private int year;

    @Column(name="price")
    private double price;

    @ManyToMany(mappedBy = "book")
    private Set<BookAuthorDao> bookAuthorSet;


}
