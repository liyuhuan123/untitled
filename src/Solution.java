public class Solution {
    public int lengthOfLastWord(String s) {
        char[] str = s.toCharArray();
        int count = 0;
        if(s ==null||str.length == 0){
            return 0;
        }
        for(int i = str.length-1;i>=0;i--){
            if(str[i] == ' '){
                if(count == 0){
                    continue;
                }else{
                    break;
                }
            }
            count++;
        }
        return count;

    }
    public static void main(String[] args){
        String str = "hello wolad";
        Solution Solution = new Solution();
        System.out.println(Solution.lengthOfLastWord(str));
    }
}
