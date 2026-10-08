class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] used = new boolean[m];
        for(int i = 0; i<n; i++){ 
            for(int j = 0; j<m; j++){
                if(nums1[i] == nums2[j] && !used[j]){
                    list.add(nums2[j]);
                    used[j] = true;
                    break;
                }
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}