import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BuilderPatternTest {

    @Test
    public void testRoomBuilder() {
        Room room = new Room.RoomBuilder("Room 101")
                            .floorNumber(2)
                            .whiteboard(true)
                            .projector(true)
                            .build();
        assertEquals(2, room.getFloorNumber());
        assertTrue(room.hasWhiteboard());
    }
}
