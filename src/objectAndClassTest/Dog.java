package objectAndClassTest;

public class Dog {
    String breed;
    int size;
    String colour;
    int dogAge;

    public Dog(){


    }
    public Dog(String name){
        System.out.println("this dog's name is " + name);
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }
}

