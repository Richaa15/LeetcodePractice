class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        
        // Initialize the top row and left column with 1, as there's only one way to reach any cell in those rows/columns
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }
        
        // Fill in the DP table using bottom-up approach
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                // The number of unique paths to cell (i, j) is the sum of paths from the cell above (i-1, j) and the cell to the left (i, j-1)
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        
        // The result is stored in the bottom-right cell of the DP table
        return dp[m - 1][n - 1];
        
    }
}