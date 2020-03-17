package Java0317;

public class Main {
    public static void main(String[] args){
        TestDemo t1 = new TestDemo();
        t1.a++;
        TestDemo.count++;
        System.out.println(t1.a);
        System.out.println(TestDemo.count);
        System.out.println("=============");
        TestDemo t2 = new TestDemo();
        t2.a++;
        TestDemo.count++;
        System.out.println(t2.a);
        System.out.println(TestDemo.count);
    }
}
