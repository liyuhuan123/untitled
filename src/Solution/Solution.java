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
        public ListNode reverseList(ListNode head) {
            if(head == null){
                //当前链表为空，不需要逆置
                return null;
            }
            if(head.next == null){
                //链表中只有一个元素，也不需要逆置
                return head;
            }
            ListNode prev = head;
            ListNode cur = null;
            ListNode newHead = null;
            while(prev != null){
                ListNode next = prev.next;
                if(next == null){
                    //当前prev就是原链表的末尾
                    newHead = prev;
                }
                //逆置的核心
                prev.next = cur;
                cur = prev;
                prev = next;
            }
            return newHead;
        }
        //给定一个带有头结点head的非空单链表，返回链表的中间结点，如果有两个中间结点
        //则返回第二个中间结点
        public ListNode middleNode(ListNode head) {
            int steps = size(head)/2;
            ListNode cur = head;
            for(int i = 0;i<steps;i++){
                cur = cur.next;
            }
            return cur;
        }
        public int size(ListNode head){
            int size = 0;
            ListNode cur = head;
            while(cur != null){
                size++;
                cur = cur.next;
            }
            return size;
        }
        //输入一个链表，输出该链表中倒数第k个结点
        public ListNode FindKthToTail(ListNode head,int k) {
            int size = size(head);
            if (head == null) {
                //链表为空，不合法
                return null;
            }
            if (k <= 0 || k > size) {
                //移动步数小于0或者移动步数大于链表长度，也不合法
                return null;
            }
            ListNode cur = head;
            int steps = size - k;
            for (int i = 0; i < steps; i++) {
                cur = cur.next;
            }
            return cur;
        }
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if(l1 == null){
                //l1为空，最终结果就是l2
                return l2;
            }
            if(l2 == null){
                //l2为空，最终结果就是l2
                return l1;
            }
            ListNode newHead = new ListNode(-1);//引入傀儡结点
            ListNode newTail = newHead;
            ListNode cur1 = l1;
            ListNode cur2 = l2;
            while(cur1 != null &&cur2 != null){
                if(cur1.val < cur2.val){
                    //把cur1对应的结点插入到新链表的末尾
                    //此时需要考虑两种情况，newTail为null和非null的情况
                    newTail.next = cur1;
                    newTail = newTail.next;
                    cur1 = cur1.next;
                }else{
                    newTail.next = cur2;
                    newTail = newTail.next;
                    cur2 = cur2.next;
                }
            }
            //当循环结束时，意味着当前cur1和cur2一定有一个到达了链表末尾
            //把另外一个没到末尾的剩下的元素都连接在链表的尾部
            if(cur1 == null){
                newTail.next = cur2;
            }else{
                newTail.next = cur1;
            }
            return newHead.next;
        }
        public ListNode partition(ListNode pHead, int x) {
            if(pHead == null){
                return null;
            }
            if(pHead.next == null){
                return pHead;
            }
            ListNode bigHead = new ListNode(-1);
            ListNode bigTail = bigHead;
            ListNode smallHead = new ListNode(-1);
            ListNode smallTail = smallHead;
            for(ListNode cur = pHead;cur != null;cur = cur.next){
                if(cur.val < x){
                    //插入到smallTail后面，创建新的结点（新的结点的next一定是null）
                    smallTail.next = new ListNode(cur.val);
                    smallTail = smallTail.next;
                }else{
                    //插入到bigTail的后面
                    bigTail.next = new ListNode(cur.val);
                    bigTail = bigTail.next;
                }
            }
            //将两个链表收尾相接到一起
            smallTail.next = bigHead.next;
            return smallHead.next;
        }
    }
}