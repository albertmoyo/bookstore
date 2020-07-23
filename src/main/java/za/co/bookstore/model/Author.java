package za.co.bookstore.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import za.co.bookstore.data.AuthorDao;

@Data
@Builder(builderClassName = "AuthorBuilder")
public class Author {


    private Long id;
    private String name;

    public static class AuthorBuilder {
        public Author.AuthorBuilder fromAuthorDao(AuthorDao author) {
            return id(author.getAuthorId())
                    .name(author.getName());
        }
    }
}
