package com.demo1.LeedCode.ListNode;

public class leedcode24_1 {
    public static void main(String[] args) {

    }
    //要用虚拟头节点来做，这样就能够统一操作
    public ListNode swapPairs(ListNode head){
        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;
        ListNode cur = dummyhead;
        while(cur.next != null && cur.next.next!=null){
            ListNode tmp1 = cur.next;
            ListNode tmp2 = cur.next.next;
            ListNode tmp3 = tmp2.next;
            cur.next = tmp2;
            tmp2.next = tmp1;
            tmp1.next = tmp3;
            cur = cur.next.next;
        }
        return dummyhead.next;
    }
}
