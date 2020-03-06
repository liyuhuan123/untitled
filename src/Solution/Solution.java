package Solution;
import java.util.Arrays;
public class Solution {
    static class ListNode {
        int val;
        ListNode next;
        //生成构造方法
        public ListNode(int val) {
            this.val = val;
        }
        //7. 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
        public ListNode deleteDuplication(ListNode pHead)
        {
            if(pHead == null){
                return null;
            }
            if(pHead.next == null){
                return pHead;
            }
            ListNode newHead = new ListNode(-1);
            ListNode newTail = newHead;
            ListNode cur = pHead;
            while(cur != null){
                if(cur.next != null &&cur.val == cur.next.val){
                    while(cur.next != null &&cur.val == cur.next.val){
                        cur = cur.next;
                    }
                    cur = cur.next;
                }else{
                    newTail.next = new ListNode(cur.val);
                    newTail = newTail.next;
                    cur = cur.next;
                }
            }
            return newHead.next;
            }
            //8.链表的回文结构
            public boolean chkPalindrome(ListNode A) {
                if (A == null) {
                    return false;
                }
                if (A.next == null) {
                    return true;
                }
                int steps = size(A) / 2;
                ListNode B = A;
                for(int i = 0;i < steps;i++){
                    B = B.next;
                }
                ListNode cur = B;
                ListNode prev = null;
                while(cur != null){
                    ListNode next = cur.next;
                    if(next == null){
                        B = cur;
                    }
                    cur.next = prev;
                    prev = cur;
                    cur = next;
                }
                while(B != null){
                    if(A.val != B.val){
                        return false;
                    }
                    A = A.next;
                    B = B.next;
                }
                return true;
            }
            public int size(ListNode A){
            int size = 0;
            for(;A != null;A = A.next){
                size++;
            }
            return size;
            }
            //9.编写一个程序，找到两个单链表相交的起始节点
            public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int sizeA = size(headA);
            int sizeB = size(headB);
            ListNode curA = headA;
            ListNode curB = headB;
            if(sizeA > sizeB){
                int offSet = sizeA - sizeB;
                for(int i = 0;i < offSet;i++){
                    curA = curA.next;
                }
            }else{
                int offSet = sizeB - sizeA;
                for(int i = 0;i < offSet;i++){
                    curB = curB.next;
                }
            }
            while(curA != null&&curB != null){
                if(curA == curB){
                    return curA;
                }
                curA = curA.next;
                curB = curB.next;
            }
            return null;
            }
            //10.给定一个链表，判断该链表是否有环
            public boolean hasCycle(ListNode head) {
            if(head == null ||head.next == null){
                return false;
            }
            ListNode fast = head;
            ListNode slow = head;
            while(fast != null&&fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
                if(fast == slow){
                    return true;
                }
            }
            return false;
            }
            //11.给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
            public ListNode detectCycle(ListNode head) {
            if(head == null ||head.next == null){
                return null;
            }
            ListNode fast = head;
            ListNode slow = head;
            while(fast != null&&fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
                if(fast == slow){
                    break;
                }
            }
            ListNode cur = fast;
            ListNode prev = head;
            if(fast == null || fast.next == null){
                return null;
            }
            while(prev != null){
                cur = cur.next;
                prev = prev.next;
            }
            return cur;
        }
        }
}