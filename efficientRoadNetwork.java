boolean efficientRoadNetwork(int n, int[][] roads) {
    Map<Integer, List<Integer>> adjacencyList = new HashMap<>();
    List<Integer> neighbors;
	for (int i = 0; i < roads.length; i++) {
		neighbors = adjacencyList.get(roads[i][0]) == null?new ArrayList<Integer>():adjacencyList.get(roads[i][0]);
		neighbors.add(roads[i][1]);
		adjacencyList.put(roads[i][0], neighbors);
		neighbors = adjacencyList.get(roads[i][1]) == null?new ArrayList<Integer>():adjacencyList.get(roads[i][1]);
		neighbors.add(roads[i][0]);
		adjacencyList.put(roads[i][1], neighbors);
	}
	for (int j = 0; j < n; j++) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(j);
		int[] costs = new int[n];
		Map<Integer, Integer> visited = new HashMap<>();
		while (!queue.isEmpty()) {
			int node = queue.remove();
			if (visited.get(node) == null)
				visited.put(node, 1);
			List<Integer> children = adjacencyList.get(node);
			if (children != null) {
				for (Integer child : children) {
					if (visited.get(child) == null) {
						queue.add(child);
						if (costs[child] == 0 || costs[child] > costs[node] + 1)
							costs[child] = costs[node] + 1;
					}
				}
			}
		}
		for (int k = 0; k < n; k++)
			if ((costs[k] >= 3 || costs[k] == 0) && k != j)
				return false;
	}
	return true;
}
