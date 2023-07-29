class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        for (int i =0; i<n; i++) {
            int lS = 0, rS = 0;
            for (int j =0; j<i ; j++) {
                lS += nums[j];
            }
            for (int k = i+1; k<n; k++){
                rS += nums[k];
            }
            
            if (lS == rS){
                return i;
            }
        }
        return -1;
    }
}