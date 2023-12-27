package constructor;

public class Car {

    private String brand;
    private String model;
    private int year;

    // 无参数的构造方法
    public Car() {
        // 在这里设置默认值
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    // 有参数的构造方法
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // 用于打印车辆信息的方法
    public void displayInfo() {
        System.out.println("Car Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
}
