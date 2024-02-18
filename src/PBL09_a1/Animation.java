package PBL09_a1;

public class Animation extends  Movie{
    private static int numAnimation;

    public Animation(String title){
        super(title);
        numAnimation++;
    }


    public static int getNumAnimation() {
        return numAnimation;
    }

    public static void setNumAnimation(int numAnimation) {
        Animation.numAnimation = numAnimation;
    }

    @Override
    public String toString() {
        return "Animation{}";
    }
}
