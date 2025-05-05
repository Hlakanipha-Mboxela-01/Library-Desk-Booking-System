package services;

import models.Book;
import repositories.BookRepository;
import exceptions.BookAlreadyCheckedOutException;
import exceptions.BookNotFoundException;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepo;

    public BookService(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public Book createBook(Book book) {
        return bookRepo.save(book);
    }

    public Book updateBook(String id, Book updated) {
        Book existing = bookRepo.findById(id)
                .orElseThrow(() -> new BookNotFoundException(id));
        existing.setTitle(updated.getTitle());
        existing.setAuthor(updated.getAuthor());
        return bookRepo.save(existing);
    }

    public Book checkoutBook(String id) {
        Book book = bookRepo.findById(id)
                .orElseThrow(() -> new BookNotFoundException(id));
        if (book.isCheckedOut()) {
            throw new BookAlreadyCheckedOutException(id);
        }
        book.setCheckedOut(true);
        return bookRepo.save(book);
    }
}
