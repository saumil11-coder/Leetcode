class Solution {
   public int[] topKFrequent(int[] nums, int k) {
       int arr[]=new int[k];
    Map<Integer, Integer> counterMap = new HashMap<>();
    for(int num : nums) {
        int count = counterMap.getOrDefault(num, 0);
        counterMap.put(num, count+1);
    }
    
    PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue()-b.getValue());
    for(Map.Entry<Integer, Integer> entry : counterMap.entrySet()) {
        pq.offer(entry);
        if(pq.size() > k) pq.poll();
    }
       for(int i=0;i<k;i++)
       {
           arr[i]=pq.poll().getKey();
       }
       return arr;
   

}
}