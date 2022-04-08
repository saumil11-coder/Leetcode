class KthLargest {

 private final PriorityQueue<Integer> pq;
private final int k;

 public KthLargest(int k, int[] nums) {
     pq=new PriorityQueue<>();
       this.k=k;
	for(Integer ele:nums)
{
add(ele);
}
 }
    
 public int add(int val) {
        pq.add(val);
if(pq.size()>k)
{
pq.poll();
}
return pq.peek();

  }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */