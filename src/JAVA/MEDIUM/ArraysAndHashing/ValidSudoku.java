package JAVA.MEDIUM.ArraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    //https://leetcode.com/problems/valid-sudoku
    public boolean isValidSudoku(char[][] board) {
        Set<String> value=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch=board[i][j];
                if(ch=='.') continue;

                String rowVal=ch+" row "+i;
                String colVal=ch+" col "+j;
                String blockVal=ch+" block "+(i/3)+"-"+(j/3);
                if (!value.add(rowVal)|| !value.add(colVal)
                        || !value.add(blockVal)) return false;
            }
        }
        return true;


    }

    public boolean isValidSudoku2(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') continue;
                int num = board[r][c] - '1';
                int boxIndex = (r / 3) * 3 + (c / 3);
                if (rows[r][num] || cols[c][num] || boxes[boxIndex][num]) {
                    return false;
                }
                rows[r][num] = true;
                cols[c][num] = true;
                boxes[boxIndex][num] = true;
            }
        }
        return true;
    }
}
