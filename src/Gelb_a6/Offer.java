package Gelb_a6;

public class Offer implements Showable{

    private int full;
    private double pro;



    @Override
    public void findPercent(int tank) {
        pro = (double) (tank*100) / full;


    }

    @Override
    public boolean giveDiscount(int tank) {
        if(tank<20){
            return false;
        }
        else{
           if( (tank-50)*(tank-50) >200){
               return true;
           }
        }
        return false;
    }

    //gettter and setter


    public int getFull() {
        return full;
    }

    public void setFull(int full) {
        this.full = full;
    }

    public double getPro() {
        return pro;
    }

    public void setPro(double pro) {
        this.pro = pro;
    }
}
