package telran.bookservice.service;

import org.springframework.stereotype.Service;
import telran.bookservice.dto.AuthorDto;
import telran.bookservice.dto.BookDto;

@Service
public interface BookService {

    boolean addBook(BookDto bookDto);

    BookDto findBookByIsbn(String isbn);

    BookDto remove(String isbn);

    BookDto updateBook(String isbm, String title);

    Iterable<BookDto> findBooksByAuthor(String authorName);

    Iterable<BookDto> findBooksByPublisher(String publisherName);

    Iterable<AuthorDto> findBookAuthors(String isbn);

    Iterable<String> findPublishersByAuthor(String authorName);

    AuthorDto removeAuthor(String authorName);

}
