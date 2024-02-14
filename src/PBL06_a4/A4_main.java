package PBL06_a4;

public class A4_main {

    public static void main(String[] args) {
        Mensch mensch = new Mensch();

        mensch.setName("Elsa");
        mensch.setGebJahr(2004);
        mensch.setAlter();

        System.out.println("Name: " + mensch.getName());
        System.out.println("Geburtsjahr: " + mensch.getGebJahr());
        System.out.println("Alter: " + mensch.getAlter());

    }


}
