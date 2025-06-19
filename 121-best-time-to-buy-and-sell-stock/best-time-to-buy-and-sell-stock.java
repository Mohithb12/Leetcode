class Solution {
    public int maxProfit(int[] prices) {
        
        int profit=Integer.MIN_VALUE,cost ,min = prices[0];

        for(int i=1;i<prices.length;i++)
        {
            cost = prices[i] - min;

            profit = Math.max(cost,profit);

            min = Math.min(prices[i],min);
        }
        return (profit < 0) ?  0 :  profit;
        
    }
}