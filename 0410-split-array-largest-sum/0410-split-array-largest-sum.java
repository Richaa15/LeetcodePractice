class Solution {
    public int splitArray(int[] nums, int k) {
        int s = 0, e = 0;
        for (int i =0; i<nums.length; i++) {
            s = Math.max(s, nums[i]); //Max element in array
            e += nums[i]; //Sum of all elements in array
        }
        //Binary Search
        while (s<e) {
            int mid  = s + (e-s)/2; //Potential ans
            //Calculate how many pieces will the array be divided int
            //With this potential answer
            int sum = 0;
            int pieces = 1; //Atleast 1 piece
            for(int num : nums) {
                if (sum + num > mid) {
                    //New subarray
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > k) {
                    s = mid+1;
                } else {
                    e = mid;
                }
        }
        return e;
    }
}