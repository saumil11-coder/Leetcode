class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)-> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        for(int i = 1;i<people.length;i++){
            int num = people[i][1];
            for(int j = i;j>num;j--){
                int[] temp = people[j];
                people[j] = people[j-1];
                people[j-1] = temp;
            }
        }
        return people;
    }
}
