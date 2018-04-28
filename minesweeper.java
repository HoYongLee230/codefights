int[][] minesweeper(boolean[][] matrix) {
    int [][] result = new int[matrix.length][matrix[0].length];
    int w = 0, x = 0, y = 0, z = 0;
    for(int i = 0; i < matrix.length; i++) {
        for(int j = 0; j < matrix[0].length; j++) {
            if(matrix[i][j]) {
                w = i > 0?i - 1:0;
                x = i < matrix.length - 1?i + 2:matrix.length;
                for(int a = w; a < x; a++) {
                    y = j > 0?j - 1:0;
                    z = j < matrix[0].length - 1?j + 2:matrix[0].length;
                    for(int b = y; b < z; b++) {
                        if(a != i || b != j)
                            result[a][b]++;
                    }
                }
            }
        }
    }
    return result;
}
