class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int lS = 0, rS = 0;
        for (int j = 0; j<n; j++) {
            rS += nums[j];
        }
        for (int i =0; i<n; i++) {
            rS -= nums[i];
            
            if (lS == rS){
                return i;
            }
            lS += nums[i];
        }
        return -1;
    }
}