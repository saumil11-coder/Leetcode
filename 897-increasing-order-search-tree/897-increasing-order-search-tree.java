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
  ArrayList<TreeNode> list=new ArrayList<>();
public TreeNode increasingBST(TreeNode root) {
	        if(root==null)return  null;
inorder(root);
for(int i=0;i<list.size()-1;i++)
{
list.get(i).right=list.get(i+1);
list.get(i).left=null;

}
list.get(list.size()-1).left=null;
list.get(list.size()-1).right=null;
return list.get(0);
 }

void inorder(TreeNode node)
{
if(node==null) return ;
inorder(node.left);
list.add(node);
inorder(node.right);
}
}