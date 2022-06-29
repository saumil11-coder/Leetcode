class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                
                if(i > 0 && j>i+1 && nums[i] == nums[i-1] && nums[j] == nums[j-1]) continue; // Skip duplicate indices/values for i and j. 
                
                int l = j+1;
                int r = nums.length-1;
                
                while(l<r){
                    
                    int mySum = (nums[i] + nums[j] + nums[l] + nums[r]); 
                    
                    //Adding positive values must not give a negative value.
                    //If they are giving a negative value then sum is probably crossing Integer.MAX_VALUE.
                    if( (nums[i] > 0 && nums[j] > 0 && nums[l] > 0 && nums[r] > 0) && mySum < 0 ) break; 
                    
                    if(mySum > target) r--; //Decrease mySum value.
                    
                    else if(mySum < target) l++; //Increase mySum value.
                    
                    else {
                        if(list.contains(Arrays.asList(nums[i] , nums[j] , nums[l] , nums[r])) == false) //Avoid duplicate lists in the result list.
                        list.add(Arrays.asList(nums[i] , nums[j] , nums[l] , nums[r]));
                        
                        while(l<r && nums[l] == nums[l+1]) l++; //skip duplicate indices/values for l.
                        while(l<r && nums[r] == nums[r-1]) r--; //skip duplicate indices/values for r.
                        l++;
                        r--;
                    }
                
            }
            }
        }
        return list;
    }
}
