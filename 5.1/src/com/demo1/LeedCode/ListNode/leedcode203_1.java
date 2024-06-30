package com.demo1.LeedCode.ListNode;



public class leedcode203_1 {
    public static void main(String[] args) {

    }

    public static ListNode remove(ListNode head, int val){
        ListNode dummyhead = new ListNode();
        //使用虚拟头节点
        dummyhead.next = head;

        ListNode curr = dummyhead;

        while(curr.next!=null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            }else {
                curr = curr.next;
            }
        }
        return dummyhead.next;
    }
}
