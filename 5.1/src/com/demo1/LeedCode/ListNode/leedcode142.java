package com.demo1.LeedCode.ListNode;

public class leedcode142 {
    public static void main(String[] args) {

    }
    public ListNode detectCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        //无环就一定有null
        while(fast!=null && fast.next !=null){
            //快指针比慢指针多走一步，只要有环，快指针就能追上慢指针
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                ListNode index1 = fast;
                ListNode index2 = head;
                while(index2!=index1){
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1;
            }
        }
        return null;
    }
}
