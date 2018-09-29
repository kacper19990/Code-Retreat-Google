import java.util.Random;
import java.util.logging.SimpleFormatter;

class Assignment_2{

    public static int SIZE = 25;


    public static void main(String[] args){
        int[][] board = new int[SIZE][SIZE];

    }

    private void populateX(int[][] board, int y){
        Random random = new Random();
        for (int i = 0; i < SIZE - 1; i++) {
            board[i][y] = random.nextInt(1);
        }
    }

    private void populate(int[][] board){
        for (int i = 0; i < SIZE - 1; i++) {
            populateX(board, i);
        }
    }

    private boolean outOfBounds(int x, int y){
        return x > SIZE - 1 || y > SIZE - 1|| x < 0 || y < 0;
    }

    public void iterate(int[][] board){
        for (int i=0; i<Math.pow(SIZE, 2); i++){

        }

    }
    public int decomposeX(int i){

    }

}