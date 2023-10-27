package telran.bookservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BookDto {
    String isbn;
    String title;
    Set<AuthorDto> authors;
    String publisher;

}
