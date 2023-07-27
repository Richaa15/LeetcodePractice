class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n]; // dp[i] represents the length of LIS ending at index i
        int maxLength = 1; // Initialize the result to 1 as the minimum length of an LIS is 1

        for (int i = 0; i < n; i++) {
            dp[i] = 1; // Initialize the LIS length for each index to 1
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1); // Update LIS length at index i
                }
            }
            maxLength = Math.max(maxLength, dp[i]); // Update the maximum LIS length
        }

        return maxLength;
    }
        
    
}