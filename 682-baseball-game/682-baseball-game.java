class Solution {
   public int calPoints(String[] ops) {
int sum=0;
List<Integer> ans=new ArrayList<Integer>();
for(int i=0;i<ops.length;i++)
{
if(!ops[i].equals("C")&&!ops[i].equals("+")&&!ops[i].equals("D"))
{
int roundScore=Integer.valueOf(ops[i]);
sum+=roundScore;
ans.add(roundScore);
}
else if(ops[i].equals("C"))
{
sum-=ans.get(ans.size()-1);
ans.remove(ans.size()-1);
}
else if(ops[i].equals("D"))
{
int roundScore=2*ans.get(ans.size()-1);
sum+=roundScore;
ans.add(roundScore);
}
else 
{
int roundScore=ans.get(ans.size()-1)+ans.get(ans.size()-2);
sum+=roundScore;
ans.add(roundScore);
}
}
return sum;
        
        
}
}