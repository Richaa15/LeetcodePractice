class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        //Initialize an empty hashmap dp
        Map<Integer, Integer> dp = new HashMap<>();
        //Set answer = 1
        int answer = 1;
        //Iterate over array for each index i
        for (int a : arr) {
            //beforeA = max length of an arithmetic subsequence 
            //that ends with arr[i] - difference
            //Otherwise beforeA = 0.
            int beforeA = dp.getOrDefault(a - difference, 0);
            //Set dp[arr[i]] = before_a + 1
            dp.put(a, beforeA + 1);
            ////update answer as answer = max(answer, dp[arr[i]])
            answer = Math.max(answer, dp.get(a));
        }
        
        return answer;
    }
}