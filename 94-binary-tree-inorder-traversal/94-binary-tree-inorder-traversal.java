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
    private void dfs(TreeNode node,List<Integer>inOrder)
    {
        if(node==null)
        {
            return;
        }
        dfs(node.left,inOrder);
        inOrder.add(node.val);
        dfs(node.right,inOrder);
        
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>inOrder=new ArrayList<>();
        dfs(root,inOrder);
        return inOrder;
        
    }
}