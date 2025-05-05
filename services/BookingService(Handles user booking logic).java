package com.yourname.library.services;

import com.yourname.library.models.Book;
import com.yourname.library.models.User;
import com.yourname.library.repositories.BookRepository;
import com.yourname.library.repositories.UserRepository;
import com.yourname.library.exceptions.UserNotFoundException;
import com.yourname.library.exceptions.BookNotFoundException;
import com.yourname.library.exceptions.MaxBooksLimitException;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    private final BookRepository bookRepo;
    private final UserRepository userRepo;

    public BookingService(BookRepository bookRepo, UserRepository userRepo) {
        this.bookRepo = bookRepo;
        this.userRepo = userRepo;
    }

    public String borrowBook(String userId, String bookId) {
        User user = userRepo.findById(userId)
                .orElseThrow(() -> new UserNotFoundException(userId));
        if (user.getBorrowedBooks().size() >= 5) {
            throw new MaxBooksLimitException(userId);
        }

        Book book = bookRepo.findById(bookId)
                .orElseThrow(() -> new BookNotFoundException(bookId));
        if (book.isCheckedOut()) {
            throw new IllegalStateException("Book already checked out.");
        }

        book.setCheckedOut(true);
        user.getBorrowedBooks().add(book);
        userRepo.save(user);
        bookRepo.save(book);

        return "Book borrowed successfully!";
    }
}
