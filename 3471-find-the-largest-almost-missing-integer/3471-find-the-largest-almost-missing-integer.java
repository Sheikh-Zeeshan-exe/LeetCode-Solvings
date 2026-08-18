class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int[] count = new int[51];
        for(int i = 0; i<=n-k; i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j = i; j < i+k; j++){
                if(!set.contains(nums[j])){
                    count[nums[j]]++;
                    set.add(nums[j]);
                }
            }
        }
        for(int i = 50; i>=0; i--){
            if(count[i] == 1){
                return i;
            }
        }
        return -1;
    }
}