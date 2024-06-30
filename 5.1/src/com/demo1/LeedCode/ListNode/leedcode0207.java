package com.demo1.LeedCode.ListNode;

public class leedcode0207 {
    public static void main(String[] args) {

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if(headA==null || headB==null){
            return null;
        }
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        int countA = 0;
        int countB = 0;
        while(nodeA.next!=null){
            nodeA = nodeA.next;
            countA++;
        }
        while(nodeB.next!=null){
            nodeB = nodeB.next;
            countB++;
        }
        nodeA = headA;
        nodeB = headB;
        if(countA>countB){
            int n = countA-countB;
            while(n!=0){
                nodeA = nodeA.next;
                n--;
            }
        }else {
            int n = countB-countA;
            while(n!=0){
                nodeB = nodeB.next;
                n--;
            }
        }
        while(nodeA!=nodeB){
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }
        return nodeA;
    }
}
