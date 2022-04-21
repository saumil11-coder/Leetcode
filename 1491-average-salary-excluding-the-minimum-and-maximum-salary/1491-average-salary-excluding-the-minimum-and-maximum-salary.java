class Solution {
    public double average(int[] salary) {
        double  sum=0.0;
        int count=0;
        Arrays.sort(salary);
        for(int i=1;i<salary.length-1;i++)
        {
        sum+=salary[i];
            ++count;
        }
        return sum/count;
        
        
    }
}