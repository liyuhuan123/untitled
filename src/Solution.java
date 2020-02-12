public class Solution {
    public int[] sortedSquares(int[] A) {
        int tmp;
        for(int i = 0;i<A.length;i++){
            A[i]   *= A[i];
        }
        for(int i = 0;i<A.length;i++){
            for(int j = i;j<A.length;j++){
                if(A[i]>A[j]){
                    tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;

                }
            }
        }
        return A;
    }
    public static void main(String[] args){
        int[] A = {1,2,34};
        Solution Solution = new Solution();
        Solution.sortedSquares(A);
        for(int i = 0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}