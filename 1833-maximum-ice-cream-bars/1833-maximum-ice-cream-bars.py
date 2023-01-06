class Solution:
    def maxIceCream(self, costs: List[int], coins: int) -> int:
        costs.sort()
        count =0
        for i in range(len(costs)):
            if costs[i]<=coins:
                count+=1
                coins=coins-costs[i]
        return count
        