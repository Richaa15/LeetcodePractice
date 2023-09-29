class Solution {
    public static boolean isIncreasing(int[] nums)
    {
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i] > nums[i+1])
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecreasing(int[] nums)
    {
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i] < nums[i+1])
            {
                return false;
            }
        }
        return true;
    }

    public boolean isMonotonic(int[] nums) {
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i] < nums[i+1])
            {
                return isIncreasing(nums);
            }
            else if(nums[i] > nums[i+1])
            {
                return isDecreasing(nums);
            }
        }
        return true;
    }
}