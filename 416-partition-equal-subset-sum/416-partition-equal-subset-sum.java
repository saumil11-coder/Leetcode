class Solution {
    public boolean canPartition(int[] nums) {
        int n= nums.length;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            
        }
        if(sum%2 != 0)return false;
        
        return isSubarray(n, nums, sum/2);
            
        
    }
    
    public boolean isSubarray(int n, int[] nums, int sum){
        boolean arr[][]= new boolean [n+1][sum+1];
        
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0){
                    arr[i][j]=false;
                }
                if(j==0){
                    arr[i][j]=true;
                }
            } 
        }
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(nums[i-1]<=j){
                    arr[i][j]= arr[i-1][j-nums[i-1]]  || arr[i-1][j] ;
                }else{
                    arr[i][j]=arr[i-1][j];
                }
            }
        }
            return arr[n-1][sum];
    }
}