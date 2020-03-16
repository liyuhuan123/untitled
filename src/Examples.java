public class Examples {
    public static void main(String[] args) {
        //观察StringBuffer的使用
        StringBuffer sb = new StringBuffer("*&");
        sb.append("hello").append("world");
        fun(sb);
        System.out.println(sb);
        //字符串反转操作
        System.out.println(sb.reverse());
        //字符串删除操作
        System.out.println(sb.delete(5,10));
        //字符串插入操作
        System.out.println(sb.delete(5,10).insert(0,"你好"));

    }
    public static void fun(StringBuffer temp){
        temp.append("\n").append("www");
    }
}
