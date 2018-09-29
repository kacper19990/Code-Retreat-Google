import java.util.Random;

public class Board {

    int SIZE = 10;

    Cell[][] board = new Cell[SIZE][SIZE];

    public void fillBoard(){
        Random random = new Random();
        for (int i = 0; i < SIZE - 1; i++){
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = new Cell(random.nextBoolean());
            }
        }
    }

    public void printBoard(){
        for (int i = 0; i < SIZE - 1; i++) {
            System.out.println();
            for (int j = 0; j < SIZE - 1; j++) {
                if (board[i][j].isState()){
                    System.out.print("1 ");
                }
                else {
                    System.out.print("  ");
                }
            }
        }

    }
}
