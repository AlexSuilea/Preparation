package hashtable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidSudoku {

    public boolean isValidSudoku2(char[][] board) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if(ch != '.'){
                    if (set.contains(ch + " in row " + i) || set.contains(ch + " in col " + j)
                            || set.contains(ch + " in block " + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                    set.add(ch + " in row " + i);
                    set.add(ch + " in col " + j);
                    set.add(ch + " in block " + i / 3 + "-" + j / 3);
                }
            }
        }
        return true;
    }

        public boolean isValidSudoku(char[][] board){
            Set<Character> rowSet = null;
            Set<Character> colSet = null;

            for (int i = 0; i < 9; i++) {
                rowSet = new HashSet<>();
                colSet = new HashSet<>();
                for (int j = 0; j < 9; j++) {
                char r = board[i][j];
                char c = board[j][i];

                if(r != '.'){
                    if(rowSet.contains(r)){
                        return false;
                    } else {
                        rowSet.add(r);
                    }
                }
                if(c != '.') {
                    if (colSet.contains(c)) {
                        return false;
                    } else {
                        colSet.add(c);
                    }
                }
            }
        }

        for(int i=0; i<9; i+=3){
            for(int j=0; j<9; j+=3){
                if(!checkBlock(i,j,board)){
                    return false;
                }
            }
        }

        return true;
    }

    private boolean checkBlock(int idxI, int idxJ, char[][] board) {
        Set<Character> blocKset = new HashSet<>();
        int rows = idxI + 3;
        int cols = idxJ + 3;

        for(int i = idxI; i<rows; i++){
            for(int j = idxJ; j<cols; j++){
                if(board[i][j] != '.'){
                    if(blocKset.contains(board[i][j])){
                        return false;
                    }
                    blocKset.add(board[i][j]);
                }
            }
        }
        return true;
    }
}
