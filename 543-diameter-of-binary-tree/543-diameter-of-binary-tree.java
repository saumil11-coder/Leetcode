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
    public int diameterOfBinaryTree(TreeNode root) {
        int dia[]=new int[1];
        help(root,dia);
        return dia[0];
    }
    public int help(TreeNode node,int dia[])
    {
        
        if(node==null) return 0;
        int leftt=help(node.left,dia);
        int rightt=help(node.right,dia);
         dia[0]=Math.max(dia[0],leftt+rightt);
        return 1+Math.max(leftt,rightt);
    }
}