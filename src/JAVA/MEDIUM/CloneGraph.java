package JAVA.MEDIUM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph {
    //https://leetcode.com/problems/clone-graph

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}


    class Solution {
        public Node cloneGraph(Node node) {
            if(node==null) return null;
            Map<Node,Node> nodeMap=new HashMap<>();
            return nodeCloner(node,nodeMap);
        }
        private Node nodeCloner(Node node,Map<Node,Node> map){
            if(map.containsKey(node)) return map.get(node);

            Node clone=new Node(node.val);
            map.put(node,clone);

            for(Node nb:node.neighbors){
                clone.neighbors.add(nodeCloner(nb,map));
            }
            return clone;
        }
    }
    /*
    import java.util.*;

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return null;

        Map<Node, Node> map = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();

        // init
        queue.offer(node);
        map.put(node, new Node(node.val));

        while (!queue.isEmpty()) {
            Node curr = queue.poll();

            for (Node nei : curr.neighbors) {
                if (!map.containsKey(nei)) {
                    map.put(nei, new Node(nei.val));
                    queue.offer(nei);
                }
                map.get(curr).neighbors.add(map.get(nei));
            }
        }

        return map.get(node);
    }
}
     */
}
