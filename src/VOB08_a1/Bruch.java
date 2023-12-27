package VOB08_a1;

public class Bruch {

    int z,n;

    public Bruch(int zaehler, int nenner) {
        this.z = zaehler;
        this.n = nenner;

    }

    @Override
    public String toString() {
        return z + "/" + n;
    }
    public int getZ() {
        return z;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
