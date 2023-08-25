class Solution {
    public boolean solve(String s1, String s2, String s3, int ind1, int ind2, int[][] dp) {
        // Base case: If the sum of ind1 and ind2 equals the length of s3, we've formed s3 successfully.
        if (ind1 + ind2 == s3.length()) return true;

        // Memoization: If the result for the current indices is already computed, return it.
        if (dp[ind1][ind2] != -1) return dp[ind1][ind2] == 1;

        boolean ans = false;

        // Check if the character at ind1 in s1 matches the character at ind1 + ind2 in s3.
        if (ind1 < s1.length() && s1.charAt(ind1) == s3.charAt(ind1 + ind2)) {
            // Recursively call solve with ind1 incremented and ind2 unchanged.
            ans |= solve(s1, s2, s3, ind1 + 1, ind2, dp);
        }

        // Check if the character at ind2 in s2 matches the character at ind1 + ind2 in s3.
        if (ind2 < s2.length() && s2.charAt(ind2) == s3.charAt(ind1 + ind2)) {
            // Recursively call solve with ind1 unchanged and ind2 incremented.
            ans |= solve(s1, s2, s3, ind1, ind2 + 1, dp);
        }

        // Store the result in dp array for memoization.
        dp[ind1][ind2] = ans ? 1 : 0;

        // Return the result of the current subproblem.
        return ans;
    }

    public boolean isInterleave(String s1, String s2, String s3) {
        // Check if the total length of s1 and s2 is equal to s3. If not, it's impossible to form s3.
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }

        // Initialize the memoization array dp with -1.
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) {
            Arrays.fill(dp[i], -1);
        }

        // Call the solve method with initial indices 0 and 0 and return the result.
        return solve(s1, s2, s3, 0, 0, dp);
    }
}
