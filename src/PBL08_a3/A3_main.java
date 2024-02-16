package PBL08_a3;

public class A3_main {

    public static void main(String[] args){

// 测试示例1
        Spielbrett brett1 = new Spielbrett(5);
        initializeBrett1(brett1);
        Spielstein stein1 = new Spielstein(brett1, 3, 2); // 初始位置(3,2)
        stein1.go(6);
        System.out.println("Endposition für Beispiel 1: (" + stein1.getCurrentRow() + "," + stein1.getCurrentCol() + ")");

        // 测试示例2
        Spielbrett brett2 = new Spielbrett(3);
        initializeBrett2(brett2);
        Spielstein stein2 = new Spielstein(brett2, 2, 2); // 初始位置(2,2)
        stein2.go(7);
        System.out.println("Endposition für Beispiel 2: (" + stein2.getCurrentRow() + "," + stein2.getCurrentCol() + ")");

    }
    // 初始化棋盘1
    private static void initializeBrett1(Spielbrett brett) {
        // 根据示例1的描述填充棋盘方向和boese状态
        // 例如:
        brett.setBrett(new Feld[][]{
                {new Feld(false, 'U'), new Feld(false, 'R'), new Feld(false, 'L'), new Feld(false, 'L'), new Feld(false, 'D')},
                {new Feld(false, 'L'), new Feld(false, 'R'), new Feld(false, 'L'), new Feld(false, 'L'), new Feld(false, 'D')},
                {new Feld(false, 'U'), new Feld(false, 'L'), new Feld(false, 'L'), new Feld(false, 'L'), new Feld(false, 'R')},
                {new Feld(false, 'D'), new Feld(false, 'R'), new Feld(false, 'U'), new Feld(false, 'L'), new Feld(false, 'L')},
                {new Feld(false, 'U'), new Feld(false, 'R'), new Feld(false, 'L'), new Feld(false, 'D'), new Feld(false, 'D')}
        });
    }

    // 初始化棋盘2
    private static void initializeBrett2(Spielbrett brett) {
        // 根据示例2的描述填充棋盘方向和boese状态
        // 例如:
        brett.setBrett(new Feld[][]{
                {new Feld(false, 'L'), new Feld(true, 'R'), new Feld(false, 'L')},
                {new Feld(false, 'L'), new Feld(true, 'R'), new Feld(false, 'U')},
                {new Feld(false, 'L'), new Feld(false, 'U'), new Feld(false, 'U')}
        });
    }


}
