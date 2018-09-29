import java.util.Random;

public class GameOfLife {



    public static void main(String[] args){
        Board board = new Board();
        board.fillBoard();

        for (int i = 0; i < 4; i++) {
            board.printBoard();
        }

    }


}
