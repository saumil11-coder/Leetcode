class Solution {
 public boolean find132pattern(int[] nums) {
if(nums.length<=2)
{
return false;
}
int check=Integer.MIN_VALUE;
Stack<Integer> st=new Stack<>();
for(int i=nums.length-1;i>=0;i--)
{
if(check>nums[i]) return true;
while(!st.isEmpty()&&st.peek()<nums[i])
{
check=Math.max(check,st.peek());
st.pop();
}
st.push(nums[i]);
}
return false;
        
}
}