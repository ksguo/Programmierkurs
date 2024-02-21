package PBL09_a2;

public class A2_main {

    public static void main(String[] args) {
        GeoForm[] myForms = {new GeoForm(), new Polygon(), new Quadrat(), new Oval(), new Quadrat(), new GeoForm()};
        int[] result = formCounterGeneral(myForms);

        // Print the result
        for (int count : result) {
            System.out.print(count + " ");
        }

    }

    public static int[] formCounterGeneral(GeoForm[] myForms) {
        int[] res = new int[6];
        res[0] = myForms.length;
        for(GeoForm form : myForms) {

            if(form instanceof Polygon) {
                res[1]++;
                if(form instanceof Rechteck) {
                    res[4]++;
                    if(form instanceof Quadrat)
                        res[5]++;
                }
            }else if(form instanceof Kreis)
                res[2]++;
            else if(form instanceof Oval)
                res[3]++;

        }
        return res;
    }


}