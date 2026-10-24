class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = nums1.length - 1;
        int i = 0;
        while(i < n){
            nums1[j] = nums2[i];
            j--;
            i++;
        }
        Arrays.sort(nums1);
    }
}