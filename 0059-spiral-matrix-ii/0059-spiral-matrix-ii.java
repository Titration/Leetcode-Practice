class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int startX = 0, startY = 0;
        int loop = 1;
        int offset = 1;
        int i, j;
        int val = 1;

        while (loop <= n / 2 + 1) {
            // top row
            for (j = startY; j < n - offset; j++) {
                result[startX][j] = val;
                val++;
                System.out.print("(" + startX + "," + j + ")");

            }
            System.out.println();
            // right column
            for (i = startX; i < n - offset; i++) {
                result[i][j] = val;
                val++;
                System.out.print("(" + i + "," + j + ")");
            }
            System.out.println();
            // bottom row
            for (; j > startY; j--) {
                result[i][j] = val;
                val++;
                System.out.print("(" + i + "," + j + ")");
            }
            System.out.println();
            // left column
            for (; i > startX; i--) {
                result[i][j] = val;
                val++;
                System.out.print("(" + i + "," + j + ")");
            }

            startX++;
            startY++;
            offset++;
            loop++;
        }

        if (n % 2 == 1) {
            result[n / 2][n / 2] = val;
        }
        
        return result;
    }
}