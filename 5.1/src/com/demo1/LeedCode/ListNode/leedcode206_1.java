package com.demo1.LeedCode.ListNode;

public class leedcode206_1 {
    public static void main(String[] args) {

    }
    public ListNode reverse(ListNode head){
        //双指针写法
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    //递归写法
    public static ListNode reverse_rull(ListNode cur,ListNode pre){
        if(cur==null){
            return pre;
        }
        ListNode tmp = cur.next;
        cur.next = pre;
        return reverse_rull(tmp,cur);

    }
}
