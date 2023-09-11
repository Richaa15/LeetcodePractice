class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> groups = new HashMap<>();

        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            
            // If the group doesn't exist yet, create it
            groups.putIfAbsent(size, new ArrayList<>());
            
            // Add the person to the group
            List<Integer> group = groups.get(size);
            group.add(i);

            // If the group is now full, add it to the result and remove it from the map
            if (group.size() == size) {
                result.add(group);
                groups.remove(size);
            }
        }

        return result;
    }
}