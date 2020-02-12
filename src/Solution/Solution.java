package Solution;

public class Solution {
    public String reverseOnlyLetters(String S) {
        char[] sc = S.toCharArray();
        int left = 0;
        if (S == null || S.length() == 0) {
            return " ";
        }
        int right = sc.length - 1;
        while (left < right) {
            if (sc[left] >= 'A' && sc[left] <= 'Z' || sc[left] >= 'a' && sc[left] <= 'z') {
                if (sc[right] >= 'A' && sc[right] <= 'Z' || sc[right] >= 'a' && sc[right] <= 'z') {
                    char tmp = sc[left];
                    sc[left] = sc[right];
                    sc[right] = tmp;
                    right--;
                    left++;
                } else {
                    right--;
                }
            } else {
                left++;
            }
        }
        String str = String.valueOf(sc);
        return str;
    }
    public static void main(String[] args){
        String S = "wo ai xi an";
        Solution Solution = new Solution();
        System.out.println(Solution.reverseOnlyLetters(S));
    }
}
