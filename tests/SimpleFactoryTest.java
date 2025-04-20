import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleFactoryTest {

    @Test
    public void testCreateDesk() {
        Desk studyDesk = DeskFactory.createDesk("study");
        assertEquals("Study Desk", studyDesk.getType());

        Desk compDesk = DeskFactory.createDesk("computer");
        assertEquals("Computer Desk", compDesk.getType());
    }
}

