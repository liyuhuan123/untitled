public class Examples {
    public static void main(String[] args) {
       //观察字符串的截取
        String str = "helloworld";
        System.out.println(str.substring(5));
        System.out.println(str.substring(0,5));
        //观察trim方法的使用
        String str1 = "  hello world  ";
        System.out.println("["+str1+"]");
        System.out.println("["+str1.trim()+"]");
        //大小写转换
        String str2 = "hello@&%*&^%world哈哈";
        System.out.println(str2.toUpperCase());
        System.out.println(str2.toLowerCase());
        //字符串length()
        String str3 = "  hello ^%$3@87((world哈哈哈";
        System.out.println(str3.length());
        //观察isEmpty方法
        System.out.println("hello".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(new String().isEmpty());
        //首字母大写
        System.out.println(fistUpper("yuisama"));
        System.out.println(fistUpper(""));
        System.out.println(fistUpper("a"));
        }
        public static String fistUpper(String str){
        if("".equals(str)||str == null){
            return str;
        }
        if(str.length() > 1){
            return str.substring(0,1).toUpperCase()+str.substring(1);
        }
        return str.toUpperCase();
        }
}
