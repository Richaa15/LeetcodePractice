class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        int[] memo = new int[s.length()];
        Arrays.fill(memo, -1);
        
        return backtrack(s, dictionary, 0, memo);
    }

    public int backtrack(String s, String[] dict, 
            int startInx, int[] memo) {
        if (startInx == s.length()) return 0;
        if (memo[startInx] != -1) return memo[startInx];

        int res = Integer.MAX_VALUE;
        String curr = s.substring(startInx);
        for (String candidate : dict) {
            if(curr.startsWith(candidate)) {
                res = Math.min(res, backtrack(s, dict, startInx + candidate.length(), memo));
            } 
        }
        res = Math.min(res, 1 + backtrack(s, dict, startInx + 1, memo));
        
        memo[startInx] = res;

        return res;
    }
}