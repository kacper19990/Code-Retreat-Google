public class Game
{

    int[][] board;
    int xSize, ySize;


    public Game(int x, int y) {
        this.xSize = x;
        this.ySize = y;
        this.board = new int[x][y];
    }

    public int getCell(int x, int y){
        return this.board[x][y];
    }

    public void setCell(int value, int x, int y) {
        this.board[x][y] = value;
    }

    public int getNeighbors(int x, int y){
        int count = 0;
        for(int i = x -1; i < x + 2; i++){
            for(int j = y - 2; j < y+2; j++){
                if (i > -1 && j > -1 && i < this.xSize && j < this.ySize ) count+= this.getCell(i, j);
            }
        }
        return count;
    }
}
