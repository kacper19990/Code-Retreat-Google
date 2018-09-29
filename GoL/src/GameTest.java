import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void testSet () {
        int x = 10;
        int y = 10;
        Game g = new Game(x, y);
        int expected = x;

        assertEquals(expected, g.board.length);
    }

    @Test
    public void testActualSet () {
        int x = 10;
        int y = 10;
        Game g = new Game(x, y);

        g.setCell(1, 5, 5);
        assertEquals(1, g.getCell(5, 5));
    }


    @Test
    public void testNeighbors () {
        int x = 10;
        int y = 10;
        Game g = new Game(x, y);

        g.setCell(1, 5, 5);
        assertEquals(1, g.getNeighbors(5, 4));
    }

    @Test
    public void ifAlive(){
        int x = 10;
        int y = 10;
        Game g = new Game(x, y);

        g.setCell(1, 5, 5);
        g.setCell(1, 3, 5);
        g.setCell(1, 5, 6);
        g.UpdateCell(4, 5);
        assertEquals(1, g.getCell(4, 5));
    }
}