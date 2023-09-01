class Solution {
    public int[] countBits(int n) {
    int[] result = new int[n + 1];
    for(int i = 1; i <= n; i++) {
        int temp = i;
        int r = 0;
        while(temp > 0) {
            temp &= temp - 1;
            r++;
        }
        result[i] = r;
    }
    return result;
 }
}