class Solution {
    public int maxProfit(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int latest = 0;
        for(int i = 0; i<n; i++){
            if(nums[i] < min){
                min = nums[i];
            }
            int profit = nums[i] - min;
            if(profit > latest){
                latest = profit;
            }
        }
        return latest;
    }
}