package tests;

import entities.User;
import repositories.inmemory.InMemoryUserRepository;

public class InMemoryUserRepositoryTest {
    public static void main(String[] args) {
        InMemoryUserRepository repo = new InMemoryUserRepository();

        User user = new User("1", "Hlakanipha");

        // Test save
        repo.save(user);

        // Test findById
        assert repo.findById("1").isPresent();

        // Test findAll
        assert repo.findAll().size() == 1;

        // Test delete
        repo.delete("1");
        assert repo.findById("1").isEmpty();

        System.out.println("All user repository tests passed!");
    }
}
