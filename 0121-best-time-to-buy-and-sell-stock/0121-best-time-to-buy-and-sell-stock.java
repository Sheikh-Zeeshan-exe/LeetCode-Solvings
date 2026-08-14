class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int j = 0;
        int maxSum = 0;
        for(int i = 1; i<n; i++){
            int currSum = prices[i] - prices[j];
            if(currSum > maxSum){
                maxSum = currSum;
            }else if(prices[i] < prices[j]){
                j = i;
            }
        }
        return maxSum;
    }
}