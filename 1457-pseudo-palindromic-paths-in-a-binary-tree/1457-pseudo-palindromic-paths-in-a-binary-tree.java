class Solution {
    public int pseudoPalindromicPaths (TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return traversal(root, map);
    }
    private int traversal(TreeNode root, HashMap<Integer, Integer> map){
        if(root == null) return 0;
        
        map.put(root.val, map.getOrDefault(root.val, 0)+1);
        int count = 0;
        if(root.left == null && root.right == null){
            if(isPseudoPalindromic(map)){
                count++;
            }
        }
        count += traversal(root.left, map);
        count += traversal(root.right, map);
        if(map.containsKey(root.val)){
            if(map.get(root.val)>1){
                map.put(root.val, map.get(root.val)-1);
            }
            else{
                map.remove(root.val);
            }
        }
        return count;
    }
    private boolean isPseudoPalindromic(HashMap<Integer, Integer> map){
       int oddCount = 0;
       for(int num : map.values()){
            if(num%2!=0){
                oddCount++;
                if(oddCount>1) return false;
            }
       }
        return true;
    }
}