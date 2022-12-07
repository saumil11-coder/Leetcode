class Solution {
    int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        rangeSum(root,low,high);
        return sum;
        
    }
        
    public void rangeSum(TreeNode root,int low,int high){
        
        if(root != null){
           
        if(low <= root.val && root.val <= high ){
            sum +=root.val;
        }
        if(low < root.val  )
            rangeSum(root.left,low,high);

        if(root.val <= high )
            rangeSum(root.right,low,high);
        
        
    }
        
    }
}