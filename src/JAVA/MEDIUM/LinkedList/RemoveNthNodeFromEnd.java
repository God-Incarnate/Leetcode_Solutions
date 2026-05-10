package JAVA.MEDIUM.LinkedList;

import JAVA.structures.ListNode;

public class RemoveNthNodeFromEnd {
    //https://leetcode.com/problems/remove-nth-node-from-end-of-list
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
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode first = head, second = head;
            while (n != 0) {
                second = second.next;
                n--;
            }
            if (second == null) {
                return head.next;
            }

            while (second.next != null) {
                first = first.next;
                second = second.next;
            }
            first.next = first.next.next;
            return head;

        }
    }
}
