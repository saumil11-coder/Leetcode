class Solution {
    public class pair{
        char ch;
        int f;
         pair(char ch,int f)
        {
            this.ch=ch;
            this.f=f;
        }
    }
    public String reorganizeString(String s) {
        int map[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            map[s.charAt(i)-'a']++;
        }
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->b.f-a.f);
        for(int i=0;i<map.length;i++)
        {
            if(map[i]>0)
            {
                pq.add(new pair((char)('a'+i),map[i]));
            }
        }
        StringBuilder sb=new StringBuilder();
        pair block=pq.poll();
        sb.append(block.ch);
        block.f--;
        while(pq.size()>0)
        {
            pair temp=pq.poll();
            sb.append(temp.ch);
            temp.f--;
            
            if(block.f>0)
            {
                pq.add(block);
                
            }
            block=temp;
            
        }
        if(block.f>0)
        {
            return "";
        }
        return sb.toString();
    }
}