public class Example {
    //给定一个字符串，判断其是否由全部数字所组成
    public static void main(String[] args){
        String str = "1a3456";
        System.out.println(isNumber(str)?"字符串由数字所构成！":
                "字符串中有非数字成员！");
    }
    public static boolean isNumber(String str){
        char[] data = str.toCharArray();
        for(int i = 0;i < data.length;i++){
            if(data[i] < '0' || data[i] > '9'){
                return false;
            }
        }
        return true;
    }
}
