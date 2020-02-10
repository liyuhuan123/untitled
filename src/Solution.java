public class Solution {
    public void rotate(int[] arr, int k) {
        int tmp, previous;
        for (int i = 0; i < k; i++) {
            previous = arr[arr.length - 1];
            for (int j = 0; j < arr.length; j++) {
                tmp = arr[j];
                arr[j] = previous;
                previous = tmp;
            }
        }
        for(int t = 0;t<arr.length;t++){
            System.out.print(arr[t]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Solution Solution = new Solution();
        Solution.rotate(arr,2);
    }
}
