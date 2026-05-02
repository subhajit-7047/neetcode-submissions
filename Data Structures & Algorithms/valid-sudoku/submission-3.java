class Solution {
    public boolean isValidSudoku(char[][] board) {
       
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num == '.') continue;

                int d = num - '1'; // convert '1'-'9' → 0-8
                int boxIndex = (i / 3) * 3 + (j / 3);

                if (rows[i][d] || cols[j][d] || boxes[boxIndex][d]) {
                    return false;
                }

                rows[i][d] = cols[j][d] = boxes[boxIndex][d] = true;
            }
        }
        return true;
    }
}
