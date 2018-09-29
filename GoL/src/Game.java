public class Game {

    int[][] board;
    int xSize, ySize;


    public Game(int x, int y) {
        this.xSize = x;
        this.ySize = y;
        this.board = new int[x][y];
    }

    public int getCell(int x, int y) {
        return this.board[x][y];
    }

    public void setCell(int value, int x, int y) {
        this.board[x][y] = value;
    }

    public int getNeighbors(int x, int y) {
        int count = 0;
        for (int i = x - 1; i < x + 2; i++) {
            for (int j = y - 2; j < y + 2; j++) {
                if (i > -1 && j > -1 && i < this.xSize && j < this.ySize) count += this.getCell(i, j);
            }
        }
        return count;
    }

    public void updateCell (int x, int y){
        int neighbors = this.getNeighbors(x, y);
        if (neighbors == 2){
            return;
        }
        else if (neighbors == 3){
            this.setCell(1, x, y);
        }
        else {
            this.setCell(0, x, y);
        }
    }

    public void updateBoard () {
        Game g = this;
        for(int i = 0; i < this.xSize; i++){
            for (int j = 0; j < this.ySize; j++) {
                g.updateCell(i, j);
            }
        }
        this.board = g.board;
    }

    public void printBoard () {
        for(int i = 0; i < this.xSize; i++){
            for (int j = 0; j < this.ySize; j++) {
                System.out.print(this.getCell(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Game game = new Game(20,20);
            while (true){
                game.updateBoard();
                game.printBoard();
        }
    }
}
