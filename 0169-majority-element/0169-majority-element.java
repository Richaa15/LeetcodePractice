class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = nums[i];
                    count = 1;
                }
            }
        }

        // Now, the candidate variable holds a potential majority element.
        // However, we need to verify if it is indeed the majority element.
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        // If count is greater than n/2, then the candidate is the majority element.
        return count > n / 2 ? candidate : -1; // Return -1 if there is no majority element.
    }
}
