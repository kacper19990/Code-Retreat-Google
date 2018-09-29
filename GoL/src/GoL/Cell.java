package GoL;

public class Cell {

    public Cell(boolean alive) {
        this.alive = alive;
    }

    public boolean alive;

    public boolean isAlive() {
        return alive;
    }

    public Cell tick(int x){
            return new Cell(this.determineNextState(x));
    }




    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean determineNextState(int number){
        /*if (this.isAlive() && number < 2){
            return false;
        }
        else if (this.isAlive() && (number == 2 || number == 3)){
            return true;
        }
        else if (this.isAlive() && number > 3){
            return false;
        }
        else if (!this.isAlive() && number == 3){
            return true;
        }*/
        return false;
    }
}
