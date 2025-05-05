package com.yourname.library.services;

import com.yourname.library.models.User;
import com.yourname.library.repositories.UserRepository;
import com.yourname.library.exceptions.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public User createUser(User user) {
        return userRepo.save(user);
    }

    public User getUserById(String userId) {
        return userRepo.findById(userId)
                .orElseThrow(() -> new UserNotFoundException(userId));
    }

    public boolean canBorrowMoreBooks(User user) {
        return user.getBorrowedBooks().size() < 5;
    }
}
