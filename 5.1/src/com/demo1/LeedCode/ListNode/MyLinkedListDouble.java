package com.demo1.LeedCode.ListNode;

public class MyLinkedListDouble {
    int size;
    ListNode head,tail;
    public MyLinkedListDouble(){
        size = 0;
        head = new ListNode(0);
        tail = new ListNode(0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int index){
        if(index<0 || index > size -1){
            return  -1;
        }
        ListNode node = head;
        if(index>size/2){
            node = tail.prev;
            int count = size - index -1;
            while(count!=0){
                node = node.prev;
                count--;
            }
        }else {
            int count = index+1;
            while(count!=0){
                node = node.next;
                count--;
            }
        }
        return node.val;
    }

    public void addAtTail(int val){
        addAtIndex(size,val);
        size++;
    }

    public void addAtIndex(int index, int val){
        ListNode node = head;
        ListNode new_node = new ListNode(val);
        while(index!=0){
            node = node.next;
            index--;
        }
        new_node.next = node.next;
        new_node.prev = node;
        node.next = new_node;
        new_node.next.prev = new_node;
        size++;
    }
    public void addAtHead(int val){
        ListNode node  = new ListNode(val);
        node.next = head.next;
        node.prev = head;
        head.next = node;
        node.next.prev = node;
        size++;
    }
    public void deleteAtIndex(int index){
        if(index < 0 || index > size -1){
            return;
        }
        //找到该index对应的元素
        ListNode node = head;
        if(index>size/2){
            node = node.prev;
            int count = size - index -1;
            while(count!=0){
                node = node.prev;
                count--;
            }
        }else {
            int count = index+1;
            while(count!=0){
                node = node.next;
                count--;
            }
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
    }


}
