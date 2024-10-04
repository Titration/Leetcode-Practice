class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] result = new int[n][n];
        int startX = 0, startY = 0;
        int count = 1;
        int loop = 1;
        int offset = 1;
        int i, j;

        while (loop <= n / 2) {
            // top row
            for (j = startY; j < n - offset; j++) {
                result[startX][j] = count;
                count++;
            }
            // right column 
            for (i = startX; i < n - offset; i++) {
                result[i][j] = count;
                count++;
            }
            // bottom row
            for (; j > startX; j--) {
                result[i][j] = count;
                count++;
            }
            //left column
            for (; i > startY; i--) {
                result[i][j] = count;
                count++;
            }
            startX++;
            startY++;
            loop++;
            offset++;
        }
        if (n % 2 == 1) {
            result[startX][startY] = n * n;
        }
        return result;
    }
}