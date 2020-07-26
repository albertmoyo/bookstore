package za.co.bookstore.data;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="author")
@ToString
@Getter
@Setter
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="author_id")
    @JsonIgnore
    private Long authorId;

    @Column(name="name")
    private String name;

    @ManyToMany(mappedBy = "author")
    @JsonIgnore
    private List<Book> book;

}
