
package api;

import models.Book;
import services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // GET /api/books – Fetch all books
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok(bookService.getAllBooks());
    }

    // POST /api/books – Create a new book
    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        return ResponseEntity.ok(bookService.createBook(book));
    }

    // PUT /api/books/{id} – Update a book
    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable String id, @RequestBody Book book) {
        return ResponseEntity.ok(bookService.updateBook(id, book));
    }

    // POST /api/books/{id}/checkout – Checkout a book
    @PostMapping("/{id}/checkout")
    public ResponseEntity<Book> checkoutBook(@PathVariable String id) {
        return ResponseEntity.ok(bookService.checkoutBook(id));
    }
}
