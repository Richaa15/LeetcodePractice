class Solution {
    public int getWinner(int[] arr, int k) {
        int n = arr.length, max = 0;
        for(int i = 0; i<n;i++){
            max = Math.max(max, arr[i]);
}
        if(k>=n) return max;
        int curr = arr[0];
        int winstreak = 0;
        
        for (int i = 1; i < arr.length; i++) {
            int opponent = arr[i];
            
            if (curr > opponent) {
                winstreak++;
            } else {
                curr = opponent;
                winstreak = 1;
            }
            
            if (winstreak == k || curr == max) {
                return curr;
            }
        }
        
        return -1;
    }
}