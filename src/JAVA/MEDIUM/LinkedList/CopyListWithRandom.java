package JAVA.MEDIUM.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandom {
    //https://leetcode.com/problems/copy-list-with-random-pointer

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


    class Solution {
        public Node copyRandomList(Node head) {
            if(head==null) return head;
            Node current = head;
            Map<Node, Node> map = new HashMap<>();
            // Step 1: Create all nodes
            while (current != null) {
                map.put(current, new Node(current.val));
                current = current.next;
            }
            current = head;
            while (current!= null) {
                Node copy = map.get(current);
                copy.next = map.get(current.next);
                copy.random = map.get(current.random);
                current=current.next;
            }

            return map.get(head);
        }
    }
}
