public class Solution {
    Map<Integer, Integer> amountDict = new HashMap<Integer, Integer>();

    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (amountDict.containsKey(amount)) return amountDict.get(amount);
        int n = amount + 1;
        for (int coin : coins) {
            int curr = 0;
            if (amount >= coin) {
                int next = coinChange(coins, amount - coin);
                if (next >= 0) curr = 1 + next;
            }
            if (curr > 0) n = Math.min(n, curr);
        }
        int finalCount = (n == amount + 1) ? -1 : n;
        amountDict.put(amount, finalCount);
        return finalCount;
    }
}
