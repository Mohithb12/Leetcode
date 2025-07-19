/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        int cnt =0;
        cnt = preorder(root);
        return cnt;
        
    }

    static int preorder(TreeNode root)
    {
        if (root == null) return 0;
       
        

        return 1+ Math.max(preorder(root.left),preorder(root.right)) ;

    }
}