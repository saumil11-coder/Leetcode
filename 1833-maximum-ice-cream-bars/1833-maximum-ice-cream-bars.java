class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
        for(int i=0;i<costs.length;i++)
        {
            if(costs[i]<=coins)
            {
                count++;
                coins = coins-costs[i];
            }
        }
        return count;
        
    }
}