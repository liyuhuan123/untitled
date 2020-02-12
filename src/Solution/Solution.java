package Solution;

public class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int sum1 = 0;
        for (int x: nums)
            sum += x;
        for (int i = 0; i < nums.length; i++) {
            if (sum1 == sum - sum1 - nums[i]){
                return i;}else{
                sum1 += nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,34,5,6,7};
        Solution Solution = new Solution();
        System.out.println(Solution.pivotIndex(arr));
    }
}