class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length, ans = 1;
        for(int i = 1; i< n; i++){
            if(arr[i]>ans){
                ans++;
            }
        }
        return ans;
    }
}