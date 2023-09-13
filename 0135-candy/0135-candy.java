class Solution {
    public int candy(int[] ratings) {
    int n = ratings.length;
    int[] candies = new int[n];

    // Initialize each child with one candy
    Arrays.fill(candies, 1);

    // Left pass: Ensure that each child with a higher rating gets more candies than the left neighbor
    for (int i = 1; i < n; i++) {
        if (ratings[i] > ratings[i - 1]) {
            candies[i] = candies[i - 1] + 1;
        }
    }

    // Right pass: Ensure that each child with a higher rating gets more candies than the right neighbor
    for (int i = n - 2; i >= 0; i--) {
        if (ratings[i] > ratings[i + 1]) {
            candies[i] = Math.max(candies[i], candies[i + 1] + 1);
        }
    }

    // Calculate the total number of candies needed
    int totalCandies = 0;
    for (int candy : candies) {
        totalCandies += candy;
    }

    return totalCandies;
  }

}