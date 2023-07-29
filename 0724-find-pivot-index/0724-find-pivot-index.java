class Solution {
    public int pivotIndex(int[] nums) {
        int lS = 0, rS = 0;
        for (int i = 0; i<nums.length; i++) {
            rS += nums[i];
        }
        for (int i =0; i<nums.length; i++) {
            rS -= nums[i];
            
            if (lS == rS){
                return i;
            }
            lS += nums[i];
        }
        return -1;
    }
}