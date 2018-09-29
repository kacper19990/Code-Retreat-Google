public class Cell {
    //Boolean to check if cell alive or dead
    boolean state;
    int numberOfNeighbours;

    Board board = new Board();

    public Cell(boolean state) {
        this.state = state;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public int countNeighbours(int x, int y, Cell board[][]){
        numberOfNeighbours = 0;
        int[] rangeX = {(x - 1), (x + 1)};
        int[] rangeY = {(y - 1), (y + 1)};
        for (int i = 0; i < rangeX.length; i++) {
            for (int j = 0; j < rangeY.length; j++) {
                if (i == x && j == y){
                }
                else if (board[i][j].isState()){
                    numberOfNeighbours++;
                }
            }
        }
        return numberOfNeighbours;
    }

    public void updateState(){
        if ((numberOfNeighbours < 2) && this.isState()){
            this.setState(false);
        }
        else if ((numberOfNeighbours == 2 || numberOfNeighbours == 3) && this.isState()){
            this.setState(true);
        }
        else if (numberOfNeighbours > 3 && this.isState()) {
            this.setState(false);
        }
        else if (!this.isState() && numberOfNeighbours == 3){
            this.setState(true);
        }
    }
}
