```mermaid
classDiagram
    class BookRepository {
        <<interface>>
        +save(book: Book)
        +findById(id: String): Optional<Book>
        +findAll(): List<Book>
        +delete(id: String)
    }

    class InMemoryBookRepository {
        +save(book: Book)
        +findById(id: String): Optional<Book>
        +findAll(): List<Book>
        +delete(id: String)
    }

    class FileSystemBookRepository {
        +save(book: Book)
        +findById(id: String): Optional<Book>
        +findAll(): List<Book>
        +delete(id: String)
    }

    class DatabaseBookRepository {
        +save(book: Book)
        +findById(id: String): Optional<Book>
        +findAll(): List<Book>
        +delete(id: String)
    }

    BookRepository <|-- InMemoryBookRepository
    BookRepository <|-- FileSystemBookRepository
    BookRepository <|-- DatabaseBookRepository
