class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
        int nge[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty()&& st.peek()<=nums2[i])
                st.pop();
            if(i<n)
            {
                if(!st.isEmpty())nge[i]=st.peek();
                else nge[i]=-1;
            }
            st.push(nums2[i]);
        }
        int arr[]=new int[nums1.length];
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums2.length-1;i++)
        {
            mp.put(nums2[i],nge[i]);
        }
        for(int i=0;i<nums1.length;i++)
        {
            if(mp.containsKey(nums1[i]))
            {
                arr[i]=mp.get(nums1[i]);
            }
            else arr[i]=-1;
        }
        return arr;
        
    }
}