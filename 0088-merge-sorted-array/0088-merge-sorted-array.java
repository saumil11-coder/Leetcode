
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m, j = 0;
        
        // copy nums2 elements to the end of nums1
		// O (n)
        while(i < nums1.length) nums1[i++] = nums2[j++];
        
        // GAP Algorithm
		// O(logn)
        int gap = (m+n)/2 + (m+n)%2;
        while (true) {
            i = 0;
            while (i < nums1.length-gap) {
                if (nums1[i] > nums1[i+gap]) 
                    swap(nums1, i, i+gap);
                i++;
            }
            if (gap == 1) break;
            gap = gap / 2 + gap % 2;
        }
    }
    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

