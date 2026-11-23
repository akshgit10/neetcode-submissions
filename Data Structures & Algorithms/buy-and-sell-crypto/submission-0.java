class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        //int j=1;
        int profit=0;
        for(int j=0; j<prices.length ;j++)
        {
            profit=Math.max(profit,prices[j]-prices[i]);
            prices[i]=Math.min(prices[i],prices[j]);
        }
        return profit;
    }
}
