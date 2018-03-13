int[][] spiralNumbers(int n) {
    int [][] result = new int [n][n];
    boolean up = false, down = false, left = false, right = true;
    for(int i = 0, j = 0, a = 1, size = n; a <= n * n; a++) {
        result[i][j] = a;
        if(right) {
            if(j == size - 1) {
                right = false;
                down = true;
                i++;
            }
            else
                j++;
        }
        else if(left) {
            if(j == n - size) {
                left = false;
                up = true;
                i--;
                size--;
            }
            else
                j--;
        }
        else if (down) {
            if(i == size - 1) {
                down = false;
                left = true;
                j--;
            }
            else
                i++;
        }
        else if (up) {
            if(i == n - size) {
                up = false;
                right = true;
                j++;
            }
            else
                i--;
        }
    }
    return result;
}
