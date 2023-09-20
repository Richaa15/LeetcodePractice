public class Solution {
    public int minOperations(int[] nums, int x) {
        // Initialize the target as -x and find the sum of all elements in nums.
        int target = -x, n = nums.length;
        for (int num : nums) target += num;
        
        // If the target is already 0, return the length of nums.
        if (target == 0) return n;
        
        // Initialize variables for tracking the maximum subarray length and current subarray sum.
        int maxLen = 0, curSum = 0, left = 0;
        
        // Iterate through the nums array using the right pointer.
        for (int right = 0; right < n; ++right) {
            // Incrementally add elements to curSum as long as curSum is less than or equal to the target.
            curSum += nums[right];
            
            // If curSum becomes greater than the target, adjust the subarray by moving the left pointer.
            while (left <= right && curSum > target) {
                curSum -= nums[left];
                left++;
            }
            
            // If curSum becomes equal to the target, update maxLen to store the maximum subarray length.
            if (curSum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        
        // If maxLen is not 0, return n - maxLen to get the minimum number of operations.
        // If maxLen is still 0, return -1 as no subarray with the target sum was found.
        return maxLen != 0 ? n - maxLen : -1;
    }
}
