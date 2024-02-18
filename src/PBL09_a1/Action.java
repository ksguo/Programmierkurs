package PBL09_a1;

public class Action extends Movie{
    private static int numAction;

    public Action(String title){
        super(title);
        numAction++;
    }

    //getter setter


    public static int getNumAction() {
        return numAction;
    }

    public static void setNumAction(int numAction) {
        Action.numAction = numAction;
    }

    @Override
    public String toString() {
        return "Action{}";
    }
}
