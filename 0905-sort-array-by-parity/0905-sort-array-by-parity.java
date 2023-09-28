class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int i=0, l = 0, r =n-1;
        for(i=0; i<n ; i++){
            if(nums[i] % 2 == 0){
                arr[l] = nums[i];
                l++;
            }
            else{
                arr[r]= nums[i];
                r--;
            }
        }
        return arr;
    }
}