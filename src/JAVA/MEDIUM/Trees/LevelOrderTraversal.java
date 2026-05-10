package JAVA.MEDIUM.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    //https://leetcode.com/problems/binary-tree-level-order-traversal

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result=new ArrayList<>();

            if(root==null) return result;

            Queue<TreeNode> visit=new LinkedList<>();

            visit.offer(root);
            while(!visit.isEmpty()){
                int size=visit.size();
                List<Integer> layer=new LinkedList<>();
                for(int i=0;i<size;i++){
                    TreeNode value=visit.poll();
                    if(value.left!=null) visit.add(value.left);
                    if(value.right!=null) visit.add(value.right);
                    layer.add(value.val);
                }
                result.add(layer);
            }
            return result;
        }
    }
}
