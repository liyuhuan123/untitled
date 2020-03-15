public class Example {
    //字符串查找
    public static void main(String[] args){
        //1.使用contains进行查找
        String str = "helloworld";
        System.out.println(str.contains("world"));//true
        //2.使用indexOf进行查找
        String str1 = "helloworld";
        System.out.println(str.indexOf("world"));//5,w开始的索引
        System.out.println(str.indexOf("000"));//-1，没有查找到
        if(str.indexOf("hello") != -1){
            System.out.println("可以找到指定字符串");
        }
        String str2 = "helloworld";
        System.out.println(str2.indexOf("l"));//2
        System.out.println(str2.indexOf("l",5));//8
        System.out.println(str2.lastIndexOf("l"));//8
    }
}
