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
    private TreeNode first;
    private TreeNode middle;
    private TreeNode prev;
    private TreeNode last;
    public void helper(TreeNode root)
    {
        if(root==null)return ;
        helper(root.left);
        if(prev!=null && (root.val<prev.val))
        {
            if(first==null)
            {
                first=prev;
                middle=root;
            }
        
        else{
            last=root;
        }
        }
        prev =root;
        helper(root.right);
    }
    public void recoverTree(TreeNode root) {
        first=last=middle=null;
        prev=new TreeNode(Integer.MIN_VALUE);
        helper(root);
        if(first!=null && last!=null)
        {
            int temp=first.val;
            first.val=last.val;
            last.val=temp;
        }
        else if(first!=null && middle!=null)
        {
            int n=first.val;
            first.val=middle.val;
            middle.val=n;
        }
    }
}