class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
   Stack<Integer> st=new Stack<>();

HashMap<Integer,Integer> hs=new HashMap<>();
int [] ans=new int[nums1.length];
for(int num:nums2)
{
while(!st.isEmpty()&&num>st.peek())
hs.put(st.pop(),num);
st.push(num);
}
int i=0;
for(int num:nums1)
{
ans[i++]=hs.getOrDefault(num,-1);

}
return ans;      
        
        
    }
}