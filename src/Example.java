public class Example {
    //给定一个字符串，判断其是否由全部数字所组成
    public static void main(String[] args){
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equalsIgnoreCase(str2));//true
    }
}
