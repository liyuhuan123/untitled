package Solution;
import java.util.Arrays;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {3,2,4};
        Solution Solution = new Solution();
        System.out.println(Arrays.toString(Solution.twoSum(nums,6)));
    }
}