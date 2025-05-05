@SpringBootTest
public class BookServiceTest {

    @MockBean
    private BookRepository bookRepo;

    @Autowired
    private BookService bookService;

    @Test
    public void testCheckoutBook_whenAvailable() {
        Book book = new Book("123", "Test Book", "Author", false);
        Mockito.when(bookRepo.findById("123")).thenReturn(Optional.of(book));
        Mockito.when(bookRepo.save(any(Book.class))).thenReturn(book);

        Book result = bookService.checkoutBook("123");

        assertTrue(result.isCheckedOut());
        assertEquals("Test Book", result.getTitle());
    }

    @Test
    public void testCheckoutBook_whenAlreadyCheckedOut_throwsException() {
        Book book = new Book("123", "Test Book", "Author", true);
        Mockito.when(bookRepo.findById("123")).thenReturn(Optional.of(book));

        assertThrows(BookAlreadyCheckedOutException.class, () -> {
            bookService.checkoutBook("123");
        });
    }
}
