public class Examples {
    public static void main(String[] args) {
       //实现字符串的拆分处理
        String str = "hello world hello world";//按照空格拆分
        String[] result = str.split(" ");
        for(String s : result){
            System.out.println(s);
        }
        String str1 = "192.168.1.1";
        String[] results = str1.split("\\.");
        for(String s : results){
            System.out.println(s);
        }
    }
}
