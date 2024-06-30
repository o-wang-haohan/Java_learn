package com.demo1.LeedCode.ListNode;

public class leedcode24 {
    public static void main(String[] args) {

    }

    public ListNode swapPairs(ListNode head){
        if(head==null || head.next == null){
            return head;
        }

        ListNode pre = head;
        ListNode cur = head.next;
        ListNode new_head = cur;
        while(cur!=null){
            ListNode tmp = cur.next;
            cur.next = pre;
            //判断是三个还是四个
            if(tmp==null || tmp.next ==null){
                pre.next = tmp;
                break;
            }else{
                pre.next = tmp.next;
                pre = tmp;
                cur = tmp.next;
            }
        }
        return new_head;
    }
}
