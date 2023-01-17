class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        /*  
            Test Case 1.
            newInterval : [2,5]
            intervals : [[1,3],[6,9]]
                                 ^
        */
        for (int[] interval : intervals) {
            if (interval[1] < newInterval[0]) {
                list.add(interval);

                // second interval[1] =>  [6, 9] > [1, 5]
            } else if (interval[0] > newInterval[1]) {
                list.add(new int[] {newInterval[0], newInterval[1]}); // added (1,5)
                newInterval = interval; // (6,9)

                // first interval[0] => [1, 3] >= [2,5]
            } else if (interval[1] >= newInterval[0]) {
                // newInterval = [1, 5]
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }
        list.add(newInterval); // added (6, 9) => list: [(1, 5), (6, 9)]
        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}