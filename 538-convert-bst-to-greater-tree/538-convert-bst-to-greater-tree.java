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
     int sum=0;
    public TreeNode convertBST(TreeNode root) {
       
       if(root==null) return null;
        TreeNode node =root;
        var st=new Stack<TreeNode>();
        while(!st.isEmpty()||node!=null)
        {
            while(node!=null)
            {
                st.add(node);
                node=node.right;
            }
           node=st.pop();
            sum+=node.val;
            node.val=sum;
            node=node.left;
        }
        return root;

    }
}