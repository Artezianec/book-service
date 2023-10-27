package telran.bookservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import telran.bookservice.dto.AuthorDto;
import telran.bookservice.dto.BookDto;
import telran.bookservice.service.BookService;

@RestController
@RequiredArgsConstructor
public class BookController {
    final BookService bookService;

    @PostMapping("/book")
    public boolean addBook(@PathVariable BookDto bookDto) {
        return bookService.addBook(bookDto);
    }


    @GetMapping("/book/{isbn}")
    public BookDto findBookByIsbn(@PathVariable String isbn) {
        return bookService.findBookByIsbn(isbn);
    }

    @DeleteMapping("/book/{isbn}")
    public BookDto remove(@PathVariable String isbn) {
        return bookService.remove(isbn);
    }

    @PutMapping("/book/{isbn}/title/{title}")
    public BookDto updateBook(@PathVariable String isbn, @PathVariable String title) {
        return bookService.updateBook(isbn, title);
    }

    @GetMapping("/books/author/{authorName}")
    public Iterable<BookDto> findBooksByAuthor(@PathVariable String authorName) {
        return bookService.findBooksByAuthor(authorName);
    }

    @GetMapping("/books/publisher/{publisherName}")
    public Iterable<BookDto> findBooksByPublisher(@PathVariable String publisherName) {
        return bookService.findBooksByPublisher(publisherName);
    }

    @GetMapping("/authors/book/{isbn}")
    public Iterable<AuthorDto> findBookAuthors(@PathVariable String isbn) {
        return bookService.findBookAuthors(isbn);
    }

    @GetMapping("/publishers/author/{authorName}")
    public Iterable<String> findPublishersByAuthor(@PathVariable String authorName) {
        return bookService.findPublishersByAuthor(authorName);
    }

    @DeleteMapping("/author/{authorName}")
    public AuthorDto removeAuthor(@PathVariable String authorName) {
        return bookService.removeAuthor(authorName);
    }
}
