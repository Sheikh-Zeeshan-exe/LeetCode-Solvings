class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int minPrize = prices[0];
        for(int i = 0; i<n; i++){
            if(prices[i] < minPrize){
                minPrize = prices[i];
            }
            if(maxProfit < prices[i] - minPrize){
                maxProfit = prices[i] - minPrize;
            }
        }
        return maxProfit;
    }
}