class Solution {
    public int change(int amount, int[] coins) {
        // Create an array to store the number of combinations for each amount
        int[] dp = new int[amount + 1];
        
        // Initialize the base case: there's one way to make amount 0 (no coins used)
        dp[0] = 1;

        // Iterate through each coin denomination
        for (int coin : coins) {
            // For each coin denomination, update the dp array for amounts from coin to the given amount
            for (int i = coin; i <= amount; i++) {
                // Accumulate the number of combinations for the current amount using the current coin
                // dp[i] represents the number of combinations without using the current coin
                // dp[i - coin] represents the number of combinations using the current coin
                dp[i] += dp[i - coin];
            }
        }

        // The final value in dp[amount] represents the total number of combinations to make the given amount
        return dp[amount];
    }
}