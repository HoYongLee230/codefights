boolean[][] greatRenaming(boolean[][] roadRegister) {
    boolean [][] newRoad = new boolean[roadRegister.length][roadRegister.length];
    for(int i = 0; i < roadRegister.length - 1; i++) {
        newRoad[0][i + 1] = roadRegister[roadRegister.length-1][i];
        newRoad[i + 1][0] = roadRegister[i][roadRegister.length-1];
        for(int j = 0; j < roadRegister.length - 1; j++)
            newRoad[i + 1][j + 1] = roadRegister[i][j];
    }
    return newRoad;
}
