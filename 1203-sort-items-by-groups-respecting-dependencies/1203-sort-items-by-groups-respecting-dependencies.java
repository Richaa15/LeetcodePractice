class Solution {
    public int[] sortItems(int n, int m, int[] group, List<List<Integer>> beforeItems) {
        // Step 1: Create a new group for items without a group
        for (int i = 0; i < group.length; i++) {
            if (group[i] == -1) {
                group[i] = m++;
            }
        }
        
        // Step 2: Build group and item graph
        List<Integer>[] groupGraph = new ArrayList[m];
        List<Integer>[] itemGraph = new ArrayList[n];
        int[] groupIndegree = new int[m];
        int[] itemIndegree = new int[n];
        
        for (int i = 0; i < m; i++) {
            groupGraph[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < n; i++) {
            itemGraph[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < n; i++) {
            for (int before : beforeItems.get(i)) {
                itemGraph[before].add(i);
                itemIndegree[i]++;
                if (group[before] != group[i]) {
                    groupGraph[group[before]].add(group[i]);
                    groupIndegree[group[i]]++;
                }
            }
        }
        
        // Step 3: Topological sort for groups and items
        List<Integer> groupOrder = topologicalSort(groupGraph, groupIndegree);
        List<Integer> itemOrder = topologicalSort(itemGraph, itemIndegree);
        
        if (groupOrder.isEmpty() || itemOrder.isEmpty()) {
            return new int[0];
        }
        
        // Step 4: Map groups to sorted items within each group
        Map<Integer, List<Integer>> groupToItems = new HashMap<>();
        for (int item : itemOrder) {
            groupToItems.computeIfAbsent(group[item], k -> new ArrayList<>()).add(item);
        }
        
        // Step 5: Build the final sorted list
        List<Integer> result = new ArrayList<>();
        for (int groupId : groupOrder) {
            result.addAll(groupToItems.getOrDefault(groupId, new ArrayList<>()));
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    
    private List<Integer> topologicalSort(List<Integer>[] graph, int[] indegree) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            result.add(node);
            
            for (int neighbor : graph[node]) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }
        
        return result.size() == indegree.length ? result : new ArrayList<>();
    }
}
