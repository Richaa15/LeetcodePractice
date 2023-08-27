class Solution {
    public boolean canCross(int[] stones) {
        HashMap<Integer, HashSet<Integer>> stonePositions = new HashMap<>();
        for (int stone : stones) {
            stonePositions.put(stone, new HashSet<>());
        }
        
        // Initialize the first stone with a jump of size 1
        stonePositions.get(0).add(1);
        
        // Iterate through each stone and check possible jumps
        for (int stone : stones) {
            HashSet<Integer> jumpSizes = stonePositions.get(stone);
            for (int jumpSize : jumpSizes) {
                int nextStone = stone + jumpSize;
                if (nextStone == stones[stones.length - 1]) {
                    return true; // Frog reached the last stone
                }
                if (stonePositions.containsKey(nextStone)) {
                    // Update possible jump sizes for the next stone
                    stonePositions.get(nextStone).add(jumpSize);
                    if (jumpSize > 1) {
                        stonePositions.get(nextStone).add(jumpSize - 1);
                    }
                    stonePositions.get(nextStone).add(jumpSize + 1);
                }
            }
        }
        
        return false;
    }
}