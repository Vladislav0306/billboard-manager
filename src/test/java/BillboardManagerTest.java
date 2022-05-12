import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillboardManagerTest {
    BillboardManager manager = new BillboardManager();
    private final Billboard first = new Billboard(1, 1, "Movie1", "action");
    private final Billboard second = new Billboard(2, 2, "Movie2", "action");
    private final Billboard third = new Billboard(3, 3, "Movie3", "action");
    private final Billboard four = new Billboard(4, 4, "Movie4", "action");
    private final Billboard five = new Billboard(5, 5, "Movie5", "action");
    private final Billboard six = new Billboard(6, 6, "Movie6", "action");
    private final Billboard seven = new Billboard(7, 7, "Movie7", "action");
    private final Billboard eight = new Billboard(8, 8, "Movie8", "action");
    private final Billboard nine = new Billboard(9, 9, "Movie9", "action");
    private final Billboard ten = new Billboard(10, 10, "Movie10", "action");

    @BeforeEach
    void prepareManager() {
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(four);
        manager.save(five);
        manager.save(six);
        manager.save(seven);
        manager.save(eight);
        manager.save(nine);
        manager.save(ten);
    }

    @Test
    public void removeAll() {
        Billboard[] expected = new Billboard[0];
        Billboard[] actual = manager.removeAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findAll() {
        Billboard[] expected = {
                first,
                second,
                third,
                four,
                five,
                six,
                seven,
                eight,
                nine,
                ten
        };
        Billboard[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void removeById() {
        manager.removeById(5);
        Billboard[] expected = {
                first,
                second,
                third,
                four,
                six,
                seven,
                eight,
                nine,
                ten
        };
        Billboard[] actual = manager.removeById(5);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findById() {
        manager.findById(5);
        Billboard expected = five;
        Billboard actual = manager.findById(5);
        assertEquals(expected, actual);
    }

    @Test
    public void findByIdNull() {
        manager.findById(20);
        Billboard expected = null;
        Billboard actual = manager.findById(20);
        assertEquals(expected, actual);
    }
}