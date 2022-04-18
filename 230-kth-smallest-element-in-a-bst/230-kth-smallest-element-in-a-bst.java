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
  int i=1;//keep track
int ans=0;
public int kthSmallest(TreeNode root, int k) {

inorder(root,k);
return ans;
        
}
public void inorder(TreeNode node,int k)
{
if(node==null) return ;
inorder(node.left,k);
if(i==k)
{
ans=node.val;
}
i++;
inorder(node.right,k);
}

}