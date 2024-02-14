package PBL06_a4;

import java.time.Year;

public class Mensch {

    public String name;
    public int gebJahr,alter;


    public void setName(String name){
          this.name =name;
    }
    public void setGebJahr(int gebJahr){
            this.gebJahr = gebJahr;
    }

    public void setAlter(){
        int aktuellesJahr = Year.now().getValue();
        this.alter = aktuellesJahr - this.gebJahr;

    }

    public String getName(){
        return  name;
    }

    public int getGebJahr(){
        return gebJahr;
    }

    public int getAlter(){
        return  alter;
    }
}
