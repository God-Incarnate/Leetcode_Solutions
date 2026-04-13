package JAVA.EASY;

public class LinkedListCycle {
    //https://leetcode.com/problems/linked-list-cycle
      class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    public class Solution {
        public boolean hasCycle(ListNode head) {
            if(head==null || head.next==null) return false;
            ListNode oneStep=head;
            ListNode twoStep=head.next;
            while(twoStep!=null && twoStep.next!=null){
                if(oneStep==twoStep){
                    return true;
                }
                oneStep=oneStep.next;
                twoStep=twoStep.next.next;
            }
            return false;
        }
    }
}
