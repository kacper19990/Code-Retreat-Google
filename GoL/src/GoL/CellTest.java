package GoL;

import org.junit.Test;

import static org.junit.Assert.*;

public class CellTest {

    @Test
    public void isAlive() {
    }

    @Test
    public void tick() {
    }

    @Test
    public void setAlive() {
    }

    @Test
    public void determineState() {
        boolean expected = true;
        Cell cell = new Cell(false);
        boolean actual = cell.tick(1).isAlive();

        assertEquals(expected, actual);
    }
}