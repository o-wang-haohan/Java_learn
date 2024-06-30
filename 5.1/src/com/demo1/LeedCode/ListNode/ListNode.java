package com.demo1.LeedCode.ListNode;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode prev;

    public ListNode(){}

    public ListNode(int val){
        this.val = val;
    }

    public ListNode(int val, ListNode next, ListNode prev){
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}
