public class Game
{
    private int size;
    int board[][];

    Game()
    {
        setSize(25);
        initialiseBoard();
    }

    public void initialiseBoard()
    {
        board = new int[size()][size()];
        for(int i = 0; i < size(); i++)
            for(int j = 0; j < size(); j++)
                setBoard(0, i, j);
    }

    boolean nextGen(int neighbours, boolean isAlive)
    {
        if(neighbours == 3)
            return true;
        else if(neighbours == 2 && isAlive)
            return true;
        else
            return false;
    }

    int checkRow(int x, int y)
    {
        return i + 1;
    }

    public void setBoard(int value, int a, int b) {
        board[a][b] = value;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    int size()
    {
        return this.size;
    }
}
