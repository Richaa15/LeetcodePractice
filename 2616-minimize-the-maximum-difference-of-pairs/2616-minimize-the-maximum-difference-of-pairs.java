class Solution {
    private boolean isPossible(int nums[] , int diff, int p) {
        int n = nums.length;
        for (int i=1; i < nums.length; i++) {
            if(nums[i] - nums[i-1] <= diff) {
                p--;
                i++;
               } 
            }
        return p<=0;
        }
    public int minimizeMax(int[] nums, int p) {
        int n = nums.length;
        Arrays.sort(nums);
        int l = 0, r  = nums[n-1] - nums[0];
        int ans = r;
        //Binary Search
        while (l<=r) {
            int mid = l+(r-l)/2;
            if(isPossible(nums, mid, p)){
                ans = mid;
                r = mid-1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}