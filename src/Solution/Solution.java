package Solution;

public class Solution {
    public int[] plusOne(int[] digits) {
        int ch = digits.length;
        for(int i = ch - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if(digits[i]!=0)
                return digits;
        }
        digits = new int[ch + 1];
        digits[0] = 1;
        return digits;
    }
}

