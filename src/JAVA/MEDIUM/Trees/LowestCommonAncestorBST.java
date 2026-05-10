package JAVA.MEDIUM.Trees;

public class LowestCommonAncestorBST {
    //https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            TreeNode current=root;
            while(current!=null){
                if(p.val<current.val && q.val<current.val) current=current.left;
                else if (p.val>current.val && q.val>current.val) current=current.right;
                else return current;
            }
            return root;
        }
    }
}
