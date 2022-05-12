import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillboardManagerLessLimitTest {
    BillboardManager manager = new BillboardManager(20);
    private final Billboard first = new Billboard(1, 1, "Movie1", "action");
    private final Billboard second = new Billboard(2, 2, "Movie2", "action");
    private final Billboard third = new Billboard(3, 3, "Movie3", "action");
    private final Billboard fourth = new Billboard(4, 4, "Movie4", "action");
    private final Billboard fifth = new Billboard(5, 5, "Movie5", "action");
    private final Billboard sixth = new Billboard(6, 6, "Movie6", "action");
    private final Billboard seventh = new Billboard(7, 7, "Movie7", "action");
    private final Billboard eighth = new Billboard(8, 8, "Movie8", "action");
    private final Billboard ninth = new Billboard(9, 9, "Movie9", "action");
    private final Billboard tenth = new Billboard(10, 10, "Movie10", "action");

    @BeforeEach
    void prepareManager() {
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
    }

    @Test
    public void findLast() {
        Billboard[] actual = manager.getLastAdd();
        Billboard[] expected = {
                tenth,
                ninth,
                eighth,
                seventh,
                sixth,
                fifth,
                fourth,
                third,
                second,
                first
        };
        assertArrayEquals(expected, actual);
    }
}