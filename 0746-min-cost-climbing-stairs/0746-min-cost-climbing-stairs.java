class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        if (n <= 2) {
            return Math.min(cost[0], cost[1]);
        }
        int first = cost[0];
        int second = cost[1];

        for (int i = 2; i < n; i++) {
            int currentCost = cost[i] + Math.min(first, second);
            first = second;
            second = currentCost;
        }

        return Math.min(first, second);
    }
}