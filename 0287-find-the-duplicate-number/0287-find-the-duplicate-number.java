class Solution {
    public int findDuplicate(int[] nums) {
        boolean [] a=new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
         if(a[nums[i]]) return nums[i];

         a[nums[i]]=true;   
        }
        return -1;
    }
}