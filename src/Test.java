public class Test{
    public static void main(String[] args){
        Java0201 Java = new Java0201();//调用不带参数的构造函数 如果程序没有提供会调用不带参数的构造函数
                Java.show();
        Java0201 Java1 = new Java0201("张飞",80,"男");
        Java1.show();
    }

}
