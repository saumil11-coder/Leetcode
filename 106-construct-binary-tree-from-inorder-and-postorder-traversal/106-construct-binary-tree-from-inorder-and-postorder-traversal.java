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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         if(inorder==null|| postorder==null || inorder.length!=postorder.length)
         {
             return null;
             
         }
        Map<Integer,Integer> MarkingRoot =new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            MarkingRoot.put(inorder[i],i);
        }
        return helper(inorder,0,inorder.length-1,postorder,0,postorder.length-1,MarkingRoot);
        
    }
    private TreeNode helper(int inorder[],int inStart,int inEnd,int postorder[] 
                            ,int pStart,int pEnd,Map<Integer,Integer> mp)
    {
        if(inStart>inEnd|| pStart>pEnd)
            return null;
        TreeNode root=new TreeNode(postorder[pEnd]);
        int inRoot=mp.get(postorder[pEnd]);
        int numsleft=inRoot-inStart;
        root.left=helper(inorder,inStart,inRoot-1,postorder,pStart,pStart+numsleft-1,mp);
        root.right=helper(inorder,inRoot+1,inEnd,postorder,pStart+numsleft,pEnd-1,mp);
        return root;
    }
}