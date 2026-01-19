class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] row = new boolean[9];
            boolean[] col = new boolean[9];
            boolean[] cube = new boolean[9];

            for (int j = 0; j < 9; j++) {
                // Row
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    if (row[num]) return false;
                    row[num] = true;
                }
                // Column
                if (board[j][i] != '.') {
                    int num = board[j][i] - '1';
                    if (col[num]) return false;
                    col[num] = true;
                }
                // 3x3 box
                int r = 3 * (i/3) + j/3;
                int c = 3 * (i%3) + j%3;
                if (board[r][c] != '.') {
                    int num = board[r][c] - '1';
                    if (cube[num]) return false;
                    cube[num] = true;
                }
            }
        }
        return true;
    }
}
