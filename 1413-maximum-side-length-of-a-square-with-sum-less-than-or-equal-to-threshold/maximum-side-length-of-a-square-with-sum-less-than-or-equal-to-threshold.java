class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] prefix = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefix[i][j] = mat[i - 1][j - 1]
                        + prefix[i - 1][j]
                        + prefix[i][j - 1]
                        - prefix[i - 1][j - 1];
            }
        }

        int maxLen = 0;
        for (int len = 1; len <= Math.min(m, n); len++) {
            boolean found = false;

            for (int i = 0; i + len <= m; i++) {
                for (int j = 0; j + len <= n; j++) {
                    int sum = prefix[i + len][j + len]
                            - prefix[i][j + len]
                            - prefix[i + len][j]
                            + prefix[i][j];

                    if (sum <= threshold) {
                        maxLen = len;
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }
        }

        return maxLen;
    }
}
