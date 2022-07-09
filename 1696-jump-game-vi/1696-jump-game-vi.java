class Solution {
    public int maxResult(int[] nums, int k) {
        LinkedList<Integer> list = new LinkedList<>(); // for storing indices
        list.add(0);
        for(int i=1; i<nums.length; i++){
			//checking if the value lies between the range of last k values, if not "bye-bye"
            if(list.getFirst() < i-k) list.removeFirst();
			// setting nums[i] equal to curr. value and curr. max value
            nums[i] += nums[list.getFirst()];
			//if index not between last k values, remove it.
            while(!list.isEmpty() && nums[list.getLast()] <= nums[i]) list.removeLast();
            list.addLast(i);
        }
        return nums[nums.length-1];
    }
}