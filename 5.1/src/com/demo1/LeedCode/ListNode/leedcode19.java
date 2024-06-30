package com.demo1.LeedCode.ListNode;

public class leedcode19 {
    public static void main(String[] args) {

    }
    public ListNode removeNthFromEnd(ListNode head, int n){
        //要使用虚拟头节点
        if(head==null){
            return head;
        }
        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;
        ListNode fast = dummyhead;
        ListNode slow = dummyhead;
        while(n!=0){
            fast = fast.next;
            n--;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummyhead.next;
    }
}
