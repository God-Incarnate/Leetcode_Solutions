package JAVA.MEDIUM.LinkedList;

import JAVA.structures.ListNode;

public class ReorderList {
    //https://leetcode.com/problems/reorder-list
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
        public void reorderList(ListNode head) {
            if(head==null||head.next==null) return;
            ListNode slow=head,fast=head;
            while(fast.next!=null && fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            ListNode rev=reverseList(slow.next);
            slow.next=null;

            ListNode st=head;

            while(rev!=null){
                ListNode temp1=st.next;
                ListNode temp2=rev.next;
                st.next=rev;
                rev.next=temp1;

                st=temp1;
                rev=temp2;

            }
        }

    }
}
