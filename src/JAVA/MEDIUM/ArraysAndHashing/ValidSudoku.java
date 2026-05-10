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


}
