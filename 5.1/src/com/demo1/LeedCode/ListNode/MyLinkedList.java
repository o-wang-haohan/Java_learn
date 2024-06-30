package com.demo1.LeedCode.ListNode;

public class MyLinkedList {
    public int size;
    public ListNode head;

    public MyLinkedList(){
        this.size = 0;
        this.head = new ListNode(0);
    }

    public int get(int index){
        if(index<0 || index >= size){
            return -1;
        }
        int count = index+1;
        ListNode node = head;
        while(count!=0){
            node = node.next;
            count--;
        }
        return node.val;
    }

    public void addAtHead(int val){
        ListNode node = new ListNode(val);
        node.next = head.next;
        head.next = node;
        size++;
    }

    public void addAtTail(int val){
        ListNode node = new ListNode(val);
        ListNode tmp = head;
        int count = size;
        while(count!=0){
            tmp = tmp.next;
            count--;
        }
        tmp.next = node;
        size++;
    }

    public void addAtIndex(int index, int val){
        if(index<0 || index > size){
            return;
        }
        ListNode node = head;
        ListNode add_node = new ListNode(val);
        while(index!=0){
            node = node.next;
            index--;
        }
        add_node.next = node.next;
        node.next = add_node;
        size++;
    }

    public void deleteAtIndex(int index){
        if(index<0 || index>size -1){
            return;
        }
        ListNode node = head;
        while(index!=0){
            node = node.next;
            index--;
        }
        node.next = node.next.next;
        size--;
    }

}
