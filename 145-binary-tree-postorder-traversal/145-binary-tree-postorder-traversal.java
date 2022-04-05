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
    private void dfs(TreeNode node,List<Integer>postOrder)
    {
        if(node==null)
        {
            return;
        }
        dfs(node.left,postOrder);
        dfs(node.right,postOrder);
        postOrder.add(node.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrder=new ArrayList<>();
        dfs(root,postOrder);
        return postOrder;
        
    }
}