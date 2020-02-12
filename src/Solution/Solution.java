package Solution;

public class Solution {
    public int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length-1;
        while(left<right){
            if(A[left]%2 != 0){
                if(A[right]%2 ==0){
                    int tmp = A[left];
                    A[left] = A[right];
                    A[right] = tmp;
                    left++;
                    right--;
                }else{
                    right--;
                }
            }else{
                left++;
            }
        }
    return A;
    }
    public static void main(String[] args){
        int[] A = {1,2,3,4};
        Solution Solution = new Solution();
        Solution.sortArrayByParity(A);
        for(int i = 0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}