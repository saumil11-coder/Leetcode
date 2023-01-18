class Solution {
    public int maxSubarraySumCircular(int[] array) {
        // variable to keep track of the total sum of the array
        int acc = 0;
        // variable to keep track of the maximum sum subarray using kadane's algorithm
        int max1 = kadane(array);
        // iterate through the array and negate each element
        for(int i = 0; i < array.length; i++) {
            acc += array[i];
            array[i] = -array[i];
        }
        // variable to keep track of the minimum sum subarray using kadane's algorithm on the negated array
        int min = kadane(array);
        // variable to keep track of the maximum sum subarray that can be formed by wrapping around the array
        int max2 = acc + min;
        // if the maximum sum subarray that can be formed by wrapping around the array is zero, return the maximum sum subarray using kadane's algorithm
        if(max2 == 0)  return max1;
        // return the maximum of the two maximum sum subarrays
        return Math.max(max1, max2);
    }
    // function to calculate the maximum sum subarray using kadane's algorithm
      public int kadane(int[] array) {
        // variable to keep track of the maximum sum subarray ending at current index
        int maxSum = array[0];
        // variable to keep track of the overall maximum sum subarray
        int max = array[0];
        // iterate through the array starting from the second element
        for(int i = 1; i < array.length; i++) {
            // update the maximum sum subarray ending at current index 
            // by taking the maximum between the current element and the sum of the current element and the maximum sum subarray ending at the previous index
            maxSum = Math.max(maxSum+array[i], array[i]);
            // update the overall maximum sum subarray by taking the maximum between the current maximum sum subarray ending at current index and the overall maximum sum subarray
            max = Math.max(max, maxSum);
        }
        return max;
    }
}