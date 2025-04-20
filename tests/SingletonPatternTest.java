import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonPatternTest {

    @Test
    public void testSingleInstance() {
        DatabaseConnection conn1 = DatabaseConnection.getInstance();
        DatabaseConnection conn2 = DatabaseConnection.getInstance();

        assertSame(conn1, conn2); // same reference
    }
}
