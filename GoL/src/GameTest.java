import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    int x, y;
    @Test
    public void testSet () {
        x = 10;
        y = 10;
        Game g = new Game(x, y);
        int expected = x;

        assertEquals(expected, g.board.length);
    }

    @Test
    public void testActualSet () {
        x = 10;
        y = 10;
        Game g = new Game(x, y);

        g.setCell(1, 5, 5);
        assertEquals(1, g.getCell(5, 5));
    }


    @Test
    public void testNeighbors () {
        x = 10;
        y = 10;
        Game g = new Game(x, y);

        g.setCell(1, 5, 5);
        assertEquals(1, g.getNeighbors(5, 4));
    }

    @Test
    public void ifAlive(){
        x = 10;
        y = 10;
        Game g = new Game(x, y);

        g.setCell(1, 5, 5);
        g.setCell(1, 3, 5);
        g.setCell(1, 5, 6);
        g.updateCell(4, 5);
        assertEquals(1, g.getCell(4, 5));
    }

    @Test
    public void alwaysAlive(){
        x = 3;
        y = 3;
        Game g = new Game(x,y);

        g.setCell(1, 1, 0);
        g.setCell(1, 1, 1);
        g.setCell(1, 0, 1);
        g.setCell(1, 0, 0);

        g.updateBoard();

        assertEquals(1, g.getCell(0,0));
        assertEquals(1, g.getCell(0,1));
        assertEquals(1, g.getCell(1,0));
        assertEquals(1, g.getCell(1,1));

    }


}