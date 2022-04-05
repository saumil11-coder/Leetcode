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
    private void dfs(TreeNode node,List<Integer> preOrder)
{
if(node==null)
 return ;
preOrder.add(node.val);
dfs(node.left,preOrder);
dfs(node.right,preOrder);
}
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preOrder=new ArrayList<Integer>();
        dfs(root,preOrder);
        return preOrder;
    }
}