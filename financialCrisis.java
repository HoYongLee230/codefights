boolean[][][] financialCrisis(boolean[][] roadRegister) {
    boolean [][][] removedCities = new boolean[roadRegister.length][roadRegister.length - 1][roadRegister.length - 1];
    for(int i = 0; i < roadRegister.length; i++) {
        for(int j = 0; j < roadRegister.length; j++) {
            for(int k = 0; k < roadRegister.length; k++) {
                if(i != j && i != k)
                    removedCities[i][j-(i>j?0:1)][k-(i>k?0:1)] = roadRegister[j][k];
            }
        }
    }
    return removedCities;
}
