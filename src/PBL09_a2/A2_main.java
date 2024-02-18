package PBL09_a2;

public class A2_main {

    public static void main(String[] args) {
// 创建GeoForm数组示例
        GeoForm[] myForms = {
                new GeoForm(),
                new Polygon(),
                new Quadrat(),
                new Oval(),
                new Quadrat(),
                new Rechteck(),


                // 假设Trapez也是一个GeoForm的子类，但在此示例中未定义
                // new Trapez()
        };

        // 调用formCounterGeneral并打印结果
        int[] res = formCounterGeneral(myForms);
        System.out.println(java.util.Arrays.toString(res));

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