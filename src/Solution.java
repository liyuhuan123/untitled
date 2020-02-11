public class Solution {
    public int lengthOfLastWord(String s) {
        char[] str = s.toCharArray();
        int count = 0;
        for(int i = str.length-1;i>=0;i--){
            if(str[i] != ' '){
                count++;
            }else{
                return count;
            }
        }
        return 0;

    }
    public static void main(String[] args){
        String str = "hello wolad";
        Solution Solution = new Solution();
        System.out.println(Solution.lengthOfLastWord(str));
    }
}
