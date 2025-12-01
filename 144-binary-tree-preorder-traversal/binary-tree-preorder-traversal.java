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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> res = new ArrayList<Integer>();
        if(root == null) return res;

        Stack<TreeNode> stk = new Stack<>();
        stk.push(root);

        while(!stk.isEmpty())
        {
            TreeNode node = stk.peek();
            res.add(node.val);
            stk.pop();

            if(node.right != null) stk.push(node.right);
            if(node.left != null) stk.push(node.left);
        }

        return res;

    }
}