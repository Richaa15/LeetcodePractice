class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            count = 0; // Reset the count for the current element
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                ans = nums[i];
                break; // No need to continue checking once we find the majority element
            }
        }
        return ans;
    }
}

