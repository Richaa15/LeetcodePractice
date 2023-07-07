class Solution {
    public boolean divideArray(int[] nums) {
         Arrays.sort(nums);

        // Check if each pair has equal elements
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return false;
            }
        }
        return true;
        
    }
}