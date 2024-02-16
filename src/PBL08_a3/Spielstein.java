package PBL08_a3;

public class Spielstein {

    private int currentRow,currentCol;
    private Spielbrett brett;

    public Spielstein(Spielbrett brett, int indexRow, int indexCol){

        this.currentCol = indexCol;
        this.currentRow = indexRow;
        this.brett = brett;
    }

    private boolean movesOut() {
        char dir = brett.getBrett()[currentRow][currentCol].getDirection();

        switch(dir) {
            case 'U':
                if(currentRow == 0)
                    return true;
                break;
            case 'D':
                if(currentRow == brett.getDim() -1 )
                    return true;
                break;
            case 'L':
                if(currentCol == 0)
                    return true;
                break;
            case 'R':
                if(currentCol == brett.getDim() -1)
                    return true;
                break;
        }
        return false;
    }

    public void go(int n) {
        while(n > 0) {
            if(!movesOut() && !brett.getBrett()[currentRow][currentCol].isBoese()) {
                char dir = brett.getBrett()[currentRow][currentCol].getDirection();
                switch (dir) {
                    case 'U':
                        currentRow --;
                        break;
                    case 'D':
                        currentRow ++;
                        break;
                    case 'L':
                        currentCol --;
                        break;
                    case 'R':
                        currentCol ++;
                        break;
                }
            }
            n--;
        }
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentCol() {
        return currentCol;
    }

    public void setCurrentCol(int currentCol) {
        this.currentCol = currentCol;
    }

    public Spielbrett getBrett() {
        return brett;
    }

    public void setBrett(Spielbrett brett) {
        this.brett = brett;
    }
}
