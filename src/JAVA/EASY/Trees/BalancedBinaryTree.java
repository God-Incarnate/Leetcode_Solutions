package JAVA.EASY.Trees;

public class BalancedBinaryTree {
    //https://leetcode.com/problems/balanced-binary-tree
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
        int maxHeightDiff=0;
        public boolean isBalanced(TreeNode root) {

            height(root);
            if(maxHeightDiff<=1){
                return true;
            }
            return false;
        }
        private int height(TreeNode root){
            if (root==null) return 0;
            int left=height(root.left);
            int right=height(root.right);
            maxHeightDiff=Math.max(maxHeightDiff,Math.abs(left-right));
            return 1+Math.max(left,right);

        }
    }
}
