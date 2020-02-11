public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] mag = magazine.toCharArray();//字符串转化为字符数组
        char[] ran = ransomNote.toCharArray();//字符串转化为字符数组
        int[] count = new int[26];
        int[] tmp2 = new int[26];
        if(mag.length<ran.length){
            return false;
        }
        for(int i = 0;i<mag.length;i++){
            count[mag[i]-'a']++;
        }for(int i = 0;i<ran.length;i++){
            count[ran[i]-'a']--;
        }for(int i = 0;i<26;i++){
            if(count[i]<0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String ran = "abcdefg";
        String mag = "acdbefg";
        Solution Solution = new Solution();
        System.out.println(Solution.canConstruct(ran,mag));
    }
}
