public class Solution {
    public boolean isPalindrome(int x) {
        int res = 0;
        int n = x;
        if(x<0)
        {return false;        }
        do{
            res = res*10+x%10;
            x = x/10;
        }while(x>0);
        if(res == n){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int x = 12321;
        Solution Solution = new Solution();
        System.out.println(Solution.isPalindrome(x));
    }
}
