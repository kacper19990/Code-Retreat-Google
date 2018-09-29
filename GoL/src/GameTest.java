import static org.junit.Assert.*;

public class GameTest {
    public void testSet () {
        int x = 10;
        int y = 10;
        Game g = new Game(x, y);
        int expected = x;

        assertEquals(expected, g.board.length);
    }

}