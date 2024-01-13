class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) return false;

        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (hashMap.containsKey(x) && i - hashMap.get(x) <= k)
                return true;
            hashMap.put(x, i);
        }
        return false;
    }
}