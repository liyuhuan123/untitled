package Solution;
import java.util.Arrays;
public class Solution {
    public int myAtoi(String str) {
        //1.判断字符串是否为空
        char[] arr = str.toCharArray();
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != ' ') {
                break;
            }
            i++;
            if (i == arr.length) {
                return 0;
            }
        }
        //2.判断符号位
        int sign = 1;
        if (arr[i] == '-') {
            sign = -1;
            i++;
        } else if (arr[i] == '+') {
            sign = 1;
            i++;
        }
        //3.判断字符合法性
        int result = 0;
        int[] res = new int[arr.length];
        int x = 0;
        int j = i;
        while (i < arr.length) {
            if (arr[i] < '0' || arr[i] > '9') {
                break;
            } else {
                res[x] = arr[i];
                i++;
                x++;
            }
        }
        if (i > j) {
            String ress = String.valueOf(res);
            result = Integer.parseInt(ress);
            if(result > Integer.MAX_VALUE){
                return Integer.MAX_VALUE*sign;
            }else if (result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE*sign;
            }else{
                return result*sign;
            }
        }
        return result;
    }
    public static void main(String[] args){
        String str = "1234wewr";
        Solution Solution = new Solution();
        System.out.println(Solution.myAtoi(str));
    }
}