package JAVA.EASY.Trees;

public class DiameterOfBinaryTree {
    //https://leetcode.com/problems/diameter-of-binary-tree

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
        int max=0;
        public int diameterOfBinaryTree(TreeNode root) {
            heightChecker(root);
            return max;
        }
        private int heightChecker(TreeNode root){
            if (root==null) return 0;
            int heightOfLeft=heightChecker(root.left);
            int heightOfRight=heightChecker(root.right);
            max=Math.max(max,heightOfLeft+heightOfRight);
            return 1+Math.max(heightOfLeft,heightOfRight);

        }

    }
}
