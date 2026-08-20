class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        ArrayList <Integer> arr1 = new ArrayList<>();
        ArrayList <Integer> arr2 = new ArrayList<>();
        int[] res = new int[n];
        for(int i = 0; i<n; i++){
            if(i == 0){
                arr1.add(nums[i]);
            }
            else if(i == 1){
                arr2.add(nums[i]);
            }
            else{
                if(arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)){
                    arr1.add(nums[i]);
                }
                else{
                    arr2.add(nums[i]);
                }
            }
        }

        int index = 0;
        for(int i = 0; i<arr1.size(); i++){
            res[index] = arr1.get(i);
            index++;
        }
        for(int i = 0; i<arr2.size(); i++){
            res[index] = arr2.get(i);
            index++;
        }
        return res;
    }
}