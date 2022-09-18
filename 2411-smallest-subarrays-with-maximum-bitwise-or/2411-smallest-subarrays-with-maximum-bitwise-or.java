class Solution {

    public int[] smallestSubarrays(int[] nums) {
        TreeSet<Integer>[] sys = new TreeSet[32];
        for (int i = 0; i < 32; i++) sys[i] = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 32; j++) {
                if ((nums[i] >> j & 1) == 1) sys[j].add(i);
            }
        }
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int max = i;
            for (TreeSet<Integer> set : sys) {
                if (!set.isEmpty()) {
                    max = Math.max(max, set.first());
                    set.remove(i);
                }
            }
            ans[i] = (max - i + 1);
        }
        return ans;
    }
}