package Solution;
import java.util.Arrays;
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int result[] = {-1,-1};
        if(nums.length==0) return result;
        int matchedCount = 0;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid] == target) {
                int sentry = mid;
                //left
                while(sentry>0 && nums[--sentry]== target) {
                }
                if(sentry == 0 && nums[sentry] == target){
                    result[matchedCount++] = sentry;
                }else{
                    result[matchedCount++] = sentry+1;
                }

                sentry = mid;
                // right
                while(sentry<nums.length-1 && nums[++sentry] == target) {
                }
                if(sentry == nums.length-1 && nums[sentry] == target) {
                    result[matchedCount] = sentry;
                }else{
                    result[matchedCount] = sentry-1;
                }
                break;
            }else if(nums[mid]< target){
                start = mid + 1;
            }else{
                end = mid-1;
            }
        }

        return result;
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,3,4,5};
        Solution Solution = new Solution();
        System.out.println(Arrays.toString(Solution.searchRange(arr,2)));
    }
}