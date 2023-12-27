package constructor;

public class ConsDemo {

    public static void main(String[] args){
// 使用无参数构造方法创建Car对象
        Car defaultCar = new Car();
        defaultCar.displayInfo(); // 打印: Car Brand: Unknown, Model: Unknown, Year: 0

        // 使用有参数构造方法创建Car对象
        Car myCar = new Car("Toyota", "Corolla", 2020);
        Car myCar2 = new Car("benz", "Corolla", 2020);
        myCar.displayInfo(); // 打印: Car Brand: Toyota, Model: Corolla, Year: 2020
        myCar2.displayInfo();



        //getter und setter test

        // 使用构造方法创建Student对象
        Student student = new Student("Alice", 20);
        System.out.println("the student's name is : " + student.getName());
        System.out.println("the student's age is : " + student.getAge());

        student.setAge(21);
        student.setName("bob");
        System.out.println("the new student's name is : " + student.getName());
        System.out.println("the new student's age is : " + student.getAge());



    }

    /*
    当一个对象被创建时候，构造方法用来初始化该对象。构造方法和它所在类的名字相同，但构造方法没有返回值。

    通常会使用构造方法给一个类的实例变量赋初值，或者执行其它必要的步骤来创建一个完整的对象。

    不管你是否自定义构造方法，所有的类都有构造方法，因为 Java 自动提供了一个默认构造方法，默认构造方法的访问修饰符和类的访问修饰符相同(类为 public，构造函数也为 public；类改为 protected，构造函数也改为 protected)。

    一旦你定义了自己的构造方法，默认构造方法就会失效。
     */



}
