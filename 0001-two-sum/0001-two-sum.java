class Solution {
    public int[] twoSum(int[] nums, int target) {

        //approach 1 (brute force)
        // int n = nums.length;
        // for(int i = 0; i<n; i++){
        //     for(int j = i+1; j<n; j++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{};


        //approach 2 (optimal)
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            int comp = target - nums[i];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int []{};
    }
}