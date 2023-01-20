class Solution {
    public int subarraysDivByK(int[] A, int K) {
       HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0, sum = 0;
        for (int num : A) {
            sum = (sum + num) % K;
            if (sum < 0) {
                sum += K;
            }
            if (map.containsKey(sum)) {
                count += map.get(sum);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;    
    }
}