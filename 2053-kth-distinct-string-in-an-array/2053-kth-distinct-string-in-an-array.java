 import java.util.Map.Entry;
class Solution {
    public String kthDistinct(String[] arr, int k) {
        String ans="";
    HashMap<String,Integer> map=new LinkedHashMap();
        for(String s:arr)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int counter=1;
        for(Entry<String,Integer> e:map.entrySet())
        {
            if(e.getValue()==1&&counter==k)
            {
                ans=e.getKey();
                break;
            }
            else if(e.getValue()==1)
            {
                counter++;
            }
        }
        return ans;
        
    }
}