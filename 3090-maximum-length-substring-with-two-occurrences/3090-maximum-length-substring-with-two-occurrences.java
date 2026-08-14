class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int sol = 0;
        for(int i = 0; i<n; i++){
            int[] count  =  new int[26];
            for(int j = i; j<n; j++){
                int ch = s.charAt(j) - 'a';
                count[ch]++;
                if (count[ch] > 2){
                    break;
                }
                sol = Math.max(sol, j-i+1);
            }
        }
        return sol;
    }
}