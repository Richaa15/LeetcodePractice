class Solution {
    public boolean search(int[] nums, int target) {
    if (null == nums || 0 == nums.length)
      return false;
    
    int s = 0;
    int e = nums.length - 1;
    while (s <= e) {
      // to avoid duplicates
      while (s < e && nums[s] == nums[s + 1])
        ++s;
      while (s < e && nums[e] == nums[e - 1])
        --e;
      
      // the code below is exactly the same with Problem 33.
      int mid = s + (e - s) / 2;
      if (nums[mid] == target)
        return true;
      
      if (nums[mid] >= nums[s]) {
        if (target >= nums[s] && target < nums[mid])
          e = mid - 1;
        else
          s = mid + 1;
      } else {
        if (target <= nums[e] && target > nums[mid])
          s = mid + 1;
        else
          e = mid - 1;
      }
    }
    
    return false;
  }
}