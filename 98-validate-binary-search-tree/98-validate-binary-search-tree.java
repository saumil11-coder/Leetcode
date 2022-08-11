class Solution {
    private boolean flag=true;
    TreeNode prev=null;
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        return flag;
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        
        inorder(root.left);
        
        if(prev!=null && root.val<=prev.val){
            flag=false;
            return;
        }
        prev=root;
        
        inorder(root.right);
    }
}