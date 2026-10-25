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
            minProd = Math.min(nums[i], minProd * nums[i]);
            maxProd = Math.max(nums[i], maxProd * nums[i]);
            finalProd = Math.max(maxProd, finalProd);
        }
        return finalProd;
    }
}