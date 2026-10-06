class Solution {
    public int[] plusOne(int[] nums) {
        int n = nums.length;
        for(int i = n-1; i >= 0; i--){
            if(nums[i] < 9){
                nums[i] = nums[i] + 1;
                return nums;
            }else{
                nums[i] = 0;
            }
        }
        int[] arr = new int[n+1];
        arr[0] = 1;
        return arr;
    }
}