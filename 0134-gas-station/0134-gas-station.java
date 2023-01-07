class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasLen = gas.length;
        int totalGas = 0;
        int totalCost = 0;
        int currentGas= 0;
        int startPoint = 0;
        for(int i = 0; i < gasLen ; i++)
        {
            totalGas+=gas[i];
            totalCost+=cost[i];
            currentGas +=gas[i]-cost[i];
            if(currentGas<0){
                startPoint=i+1;
                currentGas=0;
            }
        }
        if(totalGas<totalCost) return -1; 
        else return  startPoint;
        
    }
}