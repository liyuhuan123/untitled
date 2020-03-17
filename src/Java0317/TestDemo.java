package Java0317;

public class TestDemo {
    public int a;
    public static int count;
    public static void change(){
        count = 100;
        //a = 10;不能访问非静态数据成员
    }
}
