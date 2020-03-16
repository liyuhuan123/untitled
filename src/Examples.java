public class Examples {
        public static void main(String[] args) {
            int[] arr = {1,2,3};
            try {
                System.out.println("before");
                arr = null;
                System.out.println(arr[10]);
                System.out.println("after");
            }catch(ArrayIndexOutOfBoundsException e){
                //打印出现异常的调用栈
                System.out.println("这是个数组下标越界异常");
                e.printStackTrace();
            }catch(NullPointerException e){
                System.out.println("这是个空指针异常");
                e.printStackTrace();
            }finally{
                System.out.println("finally code");
            }
            System.out.println("after try catch");
        }
}

