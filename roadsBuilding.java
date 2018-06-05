int[][] roadsBuilding(int cities, int[][] roads) {
    int [][] roadsNeeded = new int [(cities*(cities-1)/2)-roads.length][2];
    int index = 0;
    for(int i = 0; i < cities - 1; i++) {
        for(int j = i + 1; j < cities; j++) {
            boolean exists = false;
            for(int k = 0; k < roads.length; k++) {
                if((roads[k][0]==i && roads[k][1]==j)||(roads[k][1]==i && roads[k][0]==j))
                    exists = true;
            }
            if(!exists) {
                roadsNeeded[index][0] = i;
                roadsNeeded[index++][1] = j;
            }
        }
    }
    return roadsNeeded;
}
