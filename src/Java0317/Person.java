package Java0317;

public class Person {
    public int age;//实例变量，存放在对象内
    public String name;//实例变量
    public String sex;//实例变量
    public static int count;//类变量，属于类本身，存在 方法区
    public final int size = 10;//fianl修饰的叫常量，后续不可更改
    public static final int COUNT = 99;//静态常量
    //成员实例函数
    public void eat(){
        System.out.println("eat!");
    }
    public void sleep(){
        System.out.println("sleep!");
    }
    //静态成员函数
    public static void staticTest(){
        //不能访问非静态成员
        //sex = "man";error
        System.out.println("StaticTest()");
    }

}
