public class Solution {
    public boolean isLongPressedName(String name, String typed) {
        char[] na = name.toCharArray();//字符串转化为字符数组
        char[] ty = typed.toCharArray();//字符串转化为字符数组
        int i = 0;
        int j = 0;
        if(na.length>ty.length){
            return false;
        }
        while(i<na.length&&j<ty.length){
            if(na[i] == ty[j]){
                i++;
                j++;
            }else{
                j++;
            }
            if(i == na.length){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        String name = "xiaoli";
        String typed = "xiaol";
        Solution Solution = new Solution();
        System.out.println(Solution.isLongPressedName(name,typed));
    }
}