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
   public int maxPathSum(TreeNode root) {
int maxi[]=new int[1];
maxi[0]=Integer.MIN_VALUE;
maxPath(root,maxi);
return maxi[0];        
}
private int maxPath(TreeNode node,int maximum[])
{
if(node==null) return 0;
int leftSum=Math.max(0,maxPath(node.left,maximum));
int rightSum=Math.max(0,maxPath(node.right,maximum));
maximum[0]=Math.max(maximum[0],leftSum+rightSum+node.val);
return node.val+Math.max(leftSum,rightSum);
}
}