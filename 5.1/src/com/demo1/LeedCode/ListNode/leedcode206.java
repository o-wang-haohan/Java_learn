package com.demo1.LeedCode.ListNode;

public class leedcode206 {
    public static void main(String[] args) {

    }
    //要用虚拟头节点
    public static ListNode reverse(ListNode head){
        if(head == null || head.next==null){
            return head;
        }
        ListNode node = head;
        ListNode new_node = new ListNode(0);
        while(node.next!=null){
            //往头节点插入元素
            ListNode tmp_node = new ListNode(node.val);
            tmp_node.next = new_node.next;
            new_node.next = tmp_node;
            node = node.next;
        }
        ListNode tmp_node = new ListNode(node.val);
        tmp_node.next = new_node.next;
        new_node.next = tmp_node;
        return  new_node.next;
    }
}
