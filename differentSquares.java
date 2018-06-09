int differentSquares(int[][] matrix) {
    Set <List<Integer>> hs = new HashSet<>();
    List<Integer> arrList;
    for(int i = 0; i < matrix.length - 1; i++) {
        for(int j = 0; j < matrix[0].length - 1; j++) {
            arrList = new ArrayList<>();
            for(int k = i; k < i + 2; k++) {
                for(int l = j; l < j + 2; l++)
                    arrList.add(matrix[k][l]);
            }
            hs.add(arrList);
        }
    }
    return hs.size();
}
