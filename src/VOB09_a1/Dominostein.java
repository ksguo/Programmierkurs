package VOB09_a1;

public class Dominostein {

    private int links, rechts;

    public Dominostein(int links,int rechts) {
        if(links > 6 || links <= 0) {
            this.links = 6;
        }else {
            this.links = links;
        }

        if(rechts > 6 || rechts <= 0) {
            this.rechts = 6 ;
        }else {
            this.rechts = rechts;
        }
    }


    public boolean passRechts(Dominostein d) {
        if(this.rechts == d.links) {
            return true;
        }else {
            return false;
        }

    }

    // getter und setter

    public int getLinks() {
        return links;
    }


    public void setLinks(int links) {
        this.links = links;
    }


    public int getRechts() {
        return rechts;
    }


    public void setRechts(int rechts) {
        this.rechts = rechts;
    }

    // toString method


    public String toString() {

        return "|" + this.links + "|" + this.rechts + "|";

    }


}
