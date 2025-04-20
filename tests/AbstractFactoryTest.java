import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AbstractFactoryTest {

    @Test
    public void testUIFactory() {
        UIFactory factory = new WindowsUIFactory();
        Button button = factory.createButton();
        assertEquals("Windows Button", button.render());
    }
}
