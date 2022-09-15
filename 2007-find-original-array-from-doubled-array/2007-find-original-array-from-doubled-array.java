class Solution {
    public int[] findOriginalArray(int[] changed) {
         if(changed.length%2!=0)
        {
            return new int[0];
        }
        int count=0; int limit=0;
        HashMap<Integer,Integer> mp =new HashMap<>();
        int arr[]=new int[(changed.length/2)];
        for(int i=0;i<changed.length;i++)
        {
            mp.put(changed[i],mp.getOrDefault(changed[i],0)+1);
        }
        Arrays.sort(changed);
        for(int i=0;i<changed.length;i++)
        {
             if(mp.get(changed[i])<=0)
            {
                continue;
            }
             if(mp.getOrDefault(2*changed[i],0)<=0)
            {
                return new int[0];
            }
        
                arr[limit++]=changed[i];
            
             mp.put(changed[i],mp.get(changed[i])-1);
            mp.put(2*changed[i], mp.get(2*changed[i])-1);

        }
        
        
        return arr;
    }
}