package com.demo1.LeedCode.ListNode;

public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        int cc = myLinkedList.get(0);
        System.out.println(cc);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtTail(4);
        //myLinkedList.addAtIndex(1, 2);    // 链表变为 1->2->3
        int cc1 = myLinkedList.get(1);
        System.out.println(cc1);
    }
}
