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
        List<Integer> ds=new ArrayList<>();
if(root==null) return ds;
Stack<TreeNode> st=new Stack<>();
st.push(root);
while(!st.isEmpty())
{
root=st.pop();
ds.add(root.val);
if(root.right!=null)st.push(root.right);
if(root.left!=null)st.push(root.left);
}
return ds;
        
    }
}