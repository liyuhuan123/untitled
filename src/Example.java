public class Example {
    //给定一个字符串，判断其是否由全部数字所组成
    public static void main(String[] args){
        //观察compareTo比较
        System.out.println("A".compareTo("a"));
        System.out.println("a".compareTo("A"));
        System.out.println("A".compareTo("A"));
        System.out.println("AB".compareTo("AC"));
        System.out.println("刘".compareTo("杨"));
    }
}
