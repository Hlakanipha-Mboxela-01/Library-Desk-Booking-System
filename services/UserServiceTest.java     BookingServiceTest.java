package tests.services;

import models.User;
import repositories.UserRepository;
import services.UserService;
import exceptions.UserNotFoundException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceTest {

    private UserRepository userRepository;
    private UserService userService;

    @BeforeEach
    void setUp() {
        userRepository = mock(UserRepository.class);
        userService = new UserService(userRepository);
    }

    @Test
    void createUser_shouldReturnSavedUser() {
        User user = new User("1", "Alice");
        when(userRepository.save(user)).thenReturn(user);

        User result = userService.createUser(user);

        assertEquals("Alice", result.getName());
        verify(userRepository).save(user);
    }

    @Test
    void getUserById_shouldReturnUserIfExists() {
        User user = new User("2", "Bob");
        when(userRepository.findById("2")).thenReturn(Optional.of(user));

        User result = userService.getUserById("2");

        assertEquals("Bob", result.getName());
    }

    @Test
    void getUserById_shouldThrowExceptionIfNotFound() {
        when(userRepository.findById("3")).thenReturn(Optional.empty());

        assertThrows(UserNotFoundException.class, () -> userService.getUserById("3"));
    }
}
