package variableType;

public class RunoobTest {
    // 成员变量
    private int instanceVar;
    // 静态变量
    private static int staticVar;

    public void method(int paramVar) {
        // 局部变量
        int localVar = 10;

        // 使用变量
        instanceVar = localVar;
        staticVar = paramVar;

        System.out.println("成员变量: " + instanceVar);
        System.out.println("静态变量: " + staticVar);
        System.out.println("参数变量: " + paramVar);
        System.out.println("局部变量: " + localVar);
    }

    public static void main(String[] args) {
        RunoobTest v = new RunoobTest();
        v.method(20);


        // 通过类名直接访问静态变量
        System.out.println(RunoobTest.staticVar);

        // 通过对象访问非静态变量
        RunoobTest obj = new RunoobTest();
        System.out.println(obj.instanceVar);
    }
}
