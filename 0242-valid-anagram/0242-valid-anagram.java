class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n != m){
            return false;
        }

        int[] arr = new int[26];

        for(char c : s.toCharArray()){
            arr[c-'a']++;
        }

        for(char c : t.toCharArray()){
            arr[c-'a']--;
        }

        for(int nums : arr){
            if(nums != 0){
                return false;
            }
        }

        return true;
    }
}