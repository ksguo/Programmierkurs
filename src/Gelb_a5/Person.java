package Gelb_a5;

public class Person {

    private int dest,loc;


    public Person(int dest, int loc){
        this.dest = dest;
        this.loc = loc;
    }

    public int getDest() {
        return dest;
    }

    public int getLoc() {
        return loc;
    }

    public void setLoc(int loc) {
        this.loc = loc;
    }

    public void setDest(int dest) {
        this.dest = dest;
    }
}
