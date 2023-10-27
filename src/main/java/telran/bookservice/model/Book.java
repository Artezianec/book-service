package telran.bookservice.model;

import telran.bookservice.dto.AuthorDto;

import java.util.Set;

public class Book {
    String isbn;
    String title;
    Set<Author> authors;
    Publisher publisher;


}
