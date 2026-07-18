class Solution {
    public static int GCD(int a, int b){
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
    public int findGCD(int[] nums) {
        int n = nums.length;
        int smallest = nums[0];
        int largest = nums[0];
        for(int i = 0; i<n; i++){
            if(nums[i] < smallest){
                smallest = nums[i];
            }else if(nums[i] > largest){
                largest = nums[i];
            }
        }   
        return GCD(largest,smallest);
    }
}