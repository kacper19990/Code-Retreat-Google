public class Game
{

    int[][] board;
    public Game(int x, int y) {
        this.board = new int[x][y];
    }

    public int getCell(int x, int y){
        return this.board[x][y];
    }

    public void setCell(int value, int x, int y) {
        this.board[x][y] = value;
    }
}
