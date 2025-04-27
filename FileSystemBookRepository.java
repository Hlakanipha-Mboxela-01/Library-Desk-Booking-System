package repositories.filesystem;

import repositories.BookRepository;
import entities.Book;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FileSystemBookRepository implements BookRepository {

    private String filePath;

    public FileSystemBookRepository(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void save(Book book) {
        // Simulate saving to file (future implementation)
        Map<String, Book> books = loadAll();
        books.put(book.getId(), book);
        saveAll(books); // Simulate saving to a file
    }

    @Override
    public Optional<Book> findById(String id) {
        // Simulate reading from file
        Map<String, Book> books = loadAll();
        return Optional.ofNullable(books.get(id));
    }

    @Override
    public List<Book> findAll() {
        // Simulate reading from file
        Map<String, Book> books = loadAll();
        return new ArrayList<>(books.values());
    }

    @Override
    public void delete(String id) {
        // Simulate deleting from file
        Map<String, Book> books = loadAll();
        books.remove(id);
        saveAll(books); // Simulate saving to a file
    }

    private Map<String, Book> loadAll() {
        // Placeholder: Simulate reading from a file
        return new HashMap<>();
    }

    private void saveAll(Map<String, Book> books) {
        // Placeholder: Simulate saving to a file
    }
}
