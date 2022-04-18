class Solution {
 public boolean isIsomorphic(String s, String t) {
var map=new HashMap<Character,Character>();
for(int i=0;i<s.length();i++)
{
Character sh=s.charAt(i);
Character th=t.charAt(i);
if(map.containsKey(sh)==false)
{
if(map.containsValue(th)==true)
{
return false;
}
map.put(sh,th);

}
else{
if(map.get(sh)!=th)
return false;
}
}
return true;
}
}