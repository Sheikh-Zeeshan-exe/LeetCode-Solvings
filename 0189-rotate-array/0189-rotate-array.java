class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[n];
        for(int i = 0; i<n; i++){
            temp[(i + k) % n] = nums[i];
        }
        int m = temp.length;
        for(int i = 0; i<m; i++){
            nums[i] = temp[i];
        }
    }
}