package com.demo1.LeedCode.ListNode;

public class leedcode203 {
    public static void main(String[] args) {
        //ListNode head = [1,2,6,3,4,5,6];
        int val = 6;
    }

    public static ListNode remove(ListNode head, int val){
        if(head==null){
            return head;
        }

        while(head!=null && head.val==val){
                head = head.next;
        }

        ListNode node = head;
        while(node!=null) {
            while (node.next != null && node.next.val == val) {
                    node.next = node.next.next;
            }
            node = node.next;
        }
        return head;
    }
}
