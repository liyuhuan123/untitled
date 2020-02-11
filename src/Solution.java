public class Solution {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,41};
        Solution Solution = new Solution();
        System.out.println(Solution.containsDuplicate(nums));
    }
}
