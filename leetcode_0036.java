import java.util.*;
public class leetcode_0036 {
    
    public boolean isValidSudoku(char[][] board) {
        
        System.out.println(isValidSudokucols(board));
        System.out.println(isValidSudokurows(board));
        System.out.println(isValidSudokusqs(board));
        return isValidSudokucols(board) && isValidSudokurows(board) && isValidSudokusqs(board);
    }

    public boolean isValidSudokurows(char[][] board) {
        
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == '.'){
                    continue;
                }
                if(set.contains(board[i][j])){
                    System.out.println(i +" " + j);
                    return false;
                }
                else{
                    set.add(board[i][j]);
                }
            }
        }
        return true;
    }
    public boolean isValidSudokucols(char[][] board) {
        
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if(board[j][i] == '.'){
                    continue;
                }
                if(set.contains(board[j][i])){
                    return false;
                }
                else{
                    set.add(board[j][i]);
                }
            }
        }
        return true;
    }
    public boolean isValidSudokusqs(char[][] board) {
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                HashSet<Character> set = new HashSet<>();
                for (int j2 = 0; j2 < 3; j2++) {
                    for (int k = 0; k < 3; k++) {
                        
                        if(board[i*3 + j2][j*3 + k] == '.'){
                            continue;
                        }
                        if(set.contains(board[i*3 + j2][j*3 + k])){
                            return false;
                        }
                        else{
                            set.add(board[i*3 + j2][j*3 + k]);
                        }
                    }
                }
            }   
        }
        return true;
    }

    public static void main(String[] args) {
        
    }
}
