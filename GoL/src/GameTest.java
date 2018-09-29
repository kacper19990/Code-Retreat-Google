import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void checkSize(){
        Game game = new Game();

        int expected = 25;

        assertEquals(expected, game.size());
    }

    @Test
    public void checkBoard(){
        Game game = new Game();
        int total = 0;
        int expected = 0;

        for (int i = 0; i < game.size(); i++) {
            for (int j = 0; j < game.size(); j++) {
                total = total + game.board[i][j];
            }
        }

        assertEquals(expected, total);
    }

    @Test
    public void threeNeighbours(){
        Game game = new Game();

        int neighbours = 3;
        boolean isAlive = false;
        boolean expected = true;

        assertEquals(expected, game.nextGen(neighbours, isAlive));
    }

    @Test
    public void aliveNeighbours(){
        Game game = new Game();
        int[] neighbours = new int[] {0,1,2,3,4,5,6,7,8};
        boolean isAlive = true;
        boolean expected;

        for (int i = 0; i < 9; i++) {
            switch (i){
                case 2: case 3:
                    expected = true;
                    break;
                default:
                    expected = false;
                    break;
            }
            assertEquals(expected, game.nextGen(neighbours[i], isAlive));

        }



    }

    @Test
    public void deadNeighbours() {
        Game game = new Game();
        int[] neighbours = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        boolean isAlive = false;
        boolean expected;

        for (int i = 0; i < 9; i++) {
            switch (i) {
                case 3:
                    expected = true;
                    break;
                default:
                    expected = false;
                    break;
            }
            assertEquals(expected, game.nextGen(neighbours[i], isAlive));

        }
    }

    @Test
    public void checkCellRow(){
        Game game = new Game();
        int expected;
        int x, y;
        for (int i = 0; i < 3; i++) {
            x = 1;
            y = 1;

            switch (i){
                case 0:
                    expected = 1;
                    game.setBoard(1,i,0);
                    assertEquals(expected, game.checkRow(x,y));
                    break;
                case 1:
                    expected = 2;
                    game.setBoard(1,i,0);
                    assertEquals(expected, game.checkRow(x,y));
                    break;
                case 2:
                    expected = 3;
                    game.setBoard(1,i,0);
                    assertEquals(expected, game.checkRow(x,y));
                    break;
            }
        }

    }
}