package JAVA.MEDIUM.LinkedList;

import JAVA.structures.ListNode;

public class AddTwoNumbers {
    //https://leetcode.com/problems/add-two-numbers
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode result=new ListNode(0);
            ListNode current=result;
            int carry=0;
            while (l1!=null && l2!=null){
                int value=0;
                if (carry!=0){
                    value=l1.val+l2.val+carry;
                    current.next=new ListNode(value%10);
                    current=current.next;
                    if(value>=10) carry=(value/10);
                    else carry=0;
                } else {
                    value=l1.val+l2.val;
                    current.next=new ListNode(value%10);
                    current=current.next;
                    if(value>=10) carry=(value/10);
                    else carry=0;
                }
                l1=l1.next;
                l2=l2.next;
            }
            while(l1!=null){
                int value=0;
                if(carry!=0){
                    value=l1.val+carry;
                    current.next=new ListNode(value%10);

                    if(value>=10) carry=(value/10);
                    else carry=0;
                } else {
                    current.next=new ListNode(l1.val);

                }
                current=current.next;
                l1=l1.next;
            }
            while(l2!=null){
                int value=0;
                if(carry!=0){
                    value=l2.val+carry;
                    current.next=new ListNode(value%10);

                    if(value>=10) carry=(value/10);
                    else carry=0;
                } else {
                    current.next=new ListNode(l2.val);

                }
                current=current.next;
                l2=l2.next;
            }
            if(carry!=0) current.next=new ListNode(carry);
            return result.next;
        }

        /*
        ListNode result=new ListNode(0);
        ListNode current=result;
        int carry=0;
        while (l1 != null || l2 != null || carry != 0) {
        int sum = carry;

        if (l1 != null) {
            sum += l1.val;
            l1 = l1.next;
        }

        if (l2 != null) {
            sum += l2.val;
            l2 = l2.next;
        }

        current.next = new ListNode(sum % 10);
        carry = sum / 10;
        current = current.next;
    }
        return result.next;
    }
         */
    }
}
