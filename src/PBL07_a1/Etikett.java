package PBL07_a1;

public class Etikett {

    private int size, price,id;
    static int countEti;
    public Etikett(int s, int p, int i){
        this.size = s;
        this.price = p;
        this.id = i;
        if(s != 0 && p!= 0 && i != 0){
            countEti ++;
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
