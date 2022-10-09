class Solution {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> hs=new HashSet<>();
        if(inorder(root,hs,k)==true)
            return true;
        else
            return false;
    }
    
    boolean inorder(TreeNode root,HashSet<Integer> hs,int k)
    {
        if(root==null)
            return false;
        
        if(inorder(root.left,hs,k))
            return true;
        
        if(hs.contains(k-root.val))
            return true;
        else
            hs.add(root.val);
        
        if(inorder(root.right,hs,k))
            return true;
        
        return false;
    }
}
