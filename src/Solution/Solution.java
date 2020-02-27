package Solution;
import java.util.Arrays;
public class Solution{
    //删除链表中等于给定值val的所有结点
    static class ListNode{
        int val;
        ListNode next;
        //生成构造方法
        public ListNode(int val) {
            this.val = val;
        }
        public ListNode removeElements(ListNode head,int val){
            //删除头部结点和尾部结点逻辑不一样，需要分别对待
            if(head == null){
                //链表为空
                return null;
            }
            //1.先删除中间结点的情况(非头部的情况)
            ListNode prev = head;//prev始终指向cur的前一个位置
            ListNode cur = head.next;
            while(cur != null){
                if(cur.val == val){
                    //这个结点就需要删除掉
                    prev.next = cur.next;//这一行代码下来，cur对应的结点就被删掉了
                    cur = prev.next;//cur指向下一个元素，方便进行下次循环
                }else{
                    //这个结点不需要删除
                    prev = cur;
                    cur = cur.next;
                }
            }
            //2.最后再考虑删除头结点的情况（放到最后，只需要处理一次即可）
            if(head.val == val){
                head = head.next;
            }
            return head;
        }
    }
}