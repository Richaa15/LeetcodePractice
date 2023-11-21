class Solution {
    public int countNicePairs(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = nums[i] - rev(nums[i]);
        }
        Map<Integer, Integer> hm =  new HashMap();
        int res = 0;
        int MOD = (int) 1e9 + 7;
        for(int num: arr){
            res = (res+hm.getOrDefault(num, 0)) % MOD;
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        return res;
    }
    public int rev(int num){
        int ans = 0;
        while(num > 0){
            ans = ans*10 + num%10;
            num /= 10;
        }
        return ans;
    }
}