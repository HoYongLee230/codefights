int[] citiesConquering(int n, int[][] roads) {
    int [] conquered = new int [n];
    boolean [] conqueredList = new boolean [n];
    Map<Integer, List<Integer>> neighborList = new HashMap<>();
    for(int a = 0; a < n; a++)
        neighborList.put(a, new ArrayList<Integer>());
    for (int i = 0; i < roads.length; i++) {
	List<Integer> neighbors = neighborList.get(roads[i][0]);
	neighbors.add(roads[i][1]);
	neighborList.put(roads[i][0], neighbors);
	List<Integer> neighbors2 = neighborList.get(roads[i][1]);
	neighbors2.add(roads[i][0]);
	neighborList.put(roads[i][1], neighbors2);
    }
    boolean conqueredAll = false;
    int count = 1;
    while (!conqueredAll) {
        List <Integer> toRemove = new ArrayList<>();
        for(int j = 0; j < neighborList.size(); j++) {
            if(neighborList.get(j).size() < 2 && !conqueredList[j]) {
                conquered[j] = count;
                conqueredList[j] = true;
                toRemove.add(j);
                neighborList.get(j).clear();
            }
        }
        for(int k = 0; k < n; k++) 
            neighborList.get(k).removeAll(toRemove);
        if(toRemove.size() == 0)
            conqueredAll = true;
        count++;
    }
    for(int l = 0; l < n; l++) {
        if(conquered[l] == 0)
            conquered[l] = -1;
    }
    return conquered;
}
