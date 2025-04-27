package repositories.inmemory;

import entities.Book;
import repositories.BookRepository;

import java.util.*;

public class InMemoryBookRepository implements BookRepository {

    private Map<String, Book> storage = new HashMap<>();

    @Override
    public void save(Book book) {
        storage.put(book.getId(), book); // Save or Update
    }

    @Override
    public Optional<Book> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String id) {
        storage.remove(id);
    }
}

