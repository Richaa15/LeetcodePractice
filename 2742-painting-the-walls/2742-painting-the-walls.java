class Solution {
    public int paintWalls(int[] cost, int[] time) {
        int n = cost.length;
        Integer [] dp = new Integer [n + 1];
        dp[0] = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = dp.length - 1; j >= 0; j--) {
                if (dp[j] == null) {
                    continue;
                }
                
                int nextIndex = Math.min(dp.length - 1, j + time[i] + 1);
                dp[nextIndex] = Math.min(dp[nextIndex] == null ? Integer.MAX_VALUE : dp[nextIndex], dp[j] + cost[i]);
            }
        }
        
        return dp[n];
    }
}