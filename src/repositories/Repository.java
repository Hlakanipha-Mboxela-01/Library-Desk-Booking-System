package repositories;

import java.util.List;
import java.util.Optional;

public interface Repository<T, ID> {
    void save(T entity);           // Create or Update
    Optional<T> findById(ID id);    // Read one
    List<T> findAll();              // Read all
    void delete(ID id);             // Delete
}

