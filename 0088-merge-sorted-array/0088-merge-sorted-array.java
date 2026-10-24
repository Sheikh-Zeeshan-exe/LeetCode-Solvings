
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = nums1.length - 1;
        int i = 0;

        // Copy nums2 into the empty spaces of nums1
        while (i < n) {
            nums1[j] = nums2[i];
            j--;
            i++;
        }

        // Sort nums1 using Bubble Sort
        int len = nums1.length;

        for (int k = 0; k < len - 1; k++) {
            for (int l = 0; l < len - 1 - k; l++) {
                if (nums1[l] > nums1[l + 1]) {
                    int temp = nums1[l];
                    nums1[l] = nums1[l + 1];
                    nums1[l + 1] = temp;
                }
            }
        }
    }
}
