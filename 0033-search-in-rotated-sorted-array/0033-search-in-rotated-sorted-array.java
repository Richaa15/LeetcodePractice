class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1;
        
        // Find the index of the pivot element (the smallest element)
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[n - 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    
        // Binary search over elements on the pivot element's left
        int ans = binarySearch(nums, 0, left - 1, target);
        if (ans != -1) {
            return ans;
        }
        
        // Binary search over elements on the pivot element's right
        return binarySearch(nums, left, n - 1, target);
    }
    
    // Binary search over an inclusive range [left_boundary ~ right_boundary]
    private int binarySearch(int[] nums, int l, int r, int target) {
        while (l <= r) {
            int m = (l + r) / 2;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
}