class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int minProd = nums[0];
        int maxProd = nums[0];
        int finalProd = nums[0];
        for(int i = 1; i<n; i++){
            if(nums[i] < 0){
                int temp = minProd;
                minProd = maxProd;
                maxProd = temp;
            }
            minProd = Math.min(nums[i], nums[i] * minProd);
            maxProd = Math.max(nums[i], nums[i] * maxProd);
            finalProd = Math.max(finalProd, maxProd);
        }
        return finalProd;
    }
}