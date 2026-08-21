class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        HashSet <Integer> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i = n-1; i>=0; i--){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                if(set.size() == 3){
                    return nums[i];
                }
            }
        }
        return nums[n-1];
    }
}