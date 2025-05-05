package tests.services;

import models.Book;
import models.User;
import repositories.BookRepository;
import repositories.UserRepository;
import services.BookingService;
import exceptions.BookAlreadyCheckedOutException;
import exceptions.MaxBooksLimitException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookingServiceTest {

    private BookRepository bookRepo;
    private UserRepository userRepo;
    private BookingService bookingService;

    @BeforeEach
    void setUp() {
        bookRepo = mock(BookRepository.class);
        userRepo = mock(UserRepository.class);
        bookingService = new BookingService(bookRepo, userRepo);
    }

    @Test
    void checkoutBook_shouldSucceedIfConditionsAreMet() {
        User user = new User("u1", "Nomsa");
        user.setBorrowedBooks(new ArrayList<>());
        Book book = new Book("b1", "Java Basics");

        when(userRepo.findById("u1")).thenReturn(Optional.of(user));
        when(bookRepo.findById("b1")).thenReturn(Optional.of(book));
        when(bookRepo.save(book)).thenReturn(book);

        Book result = bookingService.checkoutBook("u1", "b1");

        assertTrue(result.isCheckedOut());
        verify(bookRepo).save(book);
    }

    @Test
    void checkoutBook_shouldThrowIfBookAlreadyCheckedOut() {
        User user = new User("u2", "Thando");
        Book book = new Book("b2", "Python 101");
        book.setCheckedOut(true);

        when(userRepo.findById("u2")).thenReturn(Optional.of(user));
        when(bookRepo.findById("b2")).thenReturn(Optional.of(book));

        assertThrows(BookAlreadyCheckedOutException.class, () -> 
            bookingService.checkoutBook("u2", "b2")
        );
    }

    @Test
    void checkoutBook_shouldThrowIfUserHasFiveBooks() {
        User user = new User("u3", "Lungi");
        List<Book> borrowed = new ArrayList<>();
        for (int i = 0; i < 5; i++) borrowed.add(new Book("book" + i, "Title"));
        user.setBorrowedBooks(borrowed);
        Book book = new Book("b3", "Clean Code");

        when(userRepo.findById("u3")).thenReturn(Optional.of(user));
        when(bookRepo.findById("b3")).thenReturn(Optional.of(book));

        assertThrows(MaxBooksLimitException.class, () -> 
            bookingService.checkoutBook("u3", "b3")
        );
    }
}
