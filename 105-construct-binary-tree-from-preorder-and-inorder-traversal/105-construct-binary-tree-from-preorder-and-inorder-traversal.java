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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            mp.put(inorder[i],i);
            
        }
        TreeNode root=helper(preorder,0,preorder.length-1,inorder,0,inorder.length-1,mp);
        return root;
    }
    public TreeNode helper(int []preorder,int preStart,int preEnd,
                           int []inorder,int inStart,int inEnd,Map<Integer,Integer> mp)
    {
        if(preStart>preEnd||inStart>inEnd) return null;
        TreeNode root=new TreeNode(preorder[preStart]);
        int inRoot=mp.get(root.val);
        int distance=inRoot-inStart;
        root.left=helper(preorder,preStart+1,preStart+distance,
                             inorder,inStart,inRoot-1,mp);
        root.right=helper(preorder,preStart+distance+1,preEnd,
                             inorder,inRoot+1,inEnd,mp);
        return root;
    }
}