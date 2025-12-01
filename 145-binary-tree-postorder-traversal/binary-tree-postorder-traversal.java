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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;

        Stack<TreeNode> stk = new Stack<>();
        stk.push(root);

        while(!stk.isEmpty()){
            TreeNode node = stk.pop();
            res.add(node.val);

            if(node.left != null)stk.push(node.left);
            if(node.right != null)stk.push(node.right);
    
        }
        Collections.reverse(res);
        return res;
    }
}