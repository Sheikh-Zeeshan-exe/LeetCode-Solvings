class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int total = n * m;
        k = k % total;
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i<n; i++){
            ans.add(new ArrayList<>());
            for(int j = 0; j<m; j++){
                ans.get(i).add(0);
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){

                int oldIdx = i * m + j;
                int newIdx = (oldIdx + k) % total;

                int newRow = newIdx / m;
                int newCol = newIdx % m;

                ans.get(newRow).set(newCol, grid[i][j]);

            }
        }
        return ans;
    }
}