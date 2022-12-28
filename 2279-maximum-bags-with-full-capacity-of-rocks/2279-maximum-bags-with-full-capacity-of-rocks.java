class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = rocks.length;
        int answer;
        for(int i=0; i<n; i++){
            capacity[i] -= rocks[i];
        }
        Arrays.sort(capacity);
        for(answer=0; answer<n && additionalRocks>=capacity[answer]; answer++){
            additionalRocks -= capacity[answer];
        }
        return answer;
    }
}