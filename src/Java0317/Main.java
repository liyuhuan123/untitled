package Java0317;

public class Main {
    public static void main(String[] args){
        Person p1 = new Person();//调用不带参数的构造函数,如果程序没有提供会调用不带参数的构造函数
        p1.show();
        Person p2 = new Person("张飞",80,"男");
        p2.show();
    }
}
