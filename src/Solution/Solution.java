package Solution;
import java.util.Arrays;
public class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<3)
            return nums[nums.length-1];
        else
            return nums[nums.length-3];
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,54};
        Solution Solution = new Solution();
        System.out.println(Solution.thirdMax(arr));
    }
}

