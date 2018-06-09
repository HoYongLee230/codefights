int differentSquares(int[][] matrix) {
    Set <List<Integer>> hs = new HashSet<>();
    for(int i = 0; i < matrix.length - 1; i++) {
        for(int j = 0; j < matrix[0].length - 1; j++) {
            List<Integer> l = new ArrayList<>();
            for(int k = i; k < i + 2; k++) {
                for(int m = j; m < j + 2; m++) {
                    l.add(matrix[k][m]);
                }
            }
            hs.add(l);
        }
    }
    return hs.size();
}
