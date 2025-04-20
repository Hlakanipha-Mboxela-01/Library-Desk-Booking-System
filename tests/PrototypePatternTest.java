import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrototypePatternTest {

    @Test
    public void testDeskClone() {
        Desk original = new QuietDesk("Quiet Area");
        Desk clone = original.clone();

        assertEquals(original.getLocation(), clone.getLocation());
        assertNotSame(original, clone);
    }
}
