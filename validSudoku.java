public class validSudoku {
    class Solution {
        public static void main(String[] args) {
            char[][] board = {
            {'8', '3', '.', '.', '7', '.', '.', '.', '.'}, 
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, 
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, 
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, 
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, 
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, 
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, 
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, 
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
            System.out.println(isValidSudoku(board));
        }

        public static boolean isValidSudoku(char[][] board) {
            boolean hasEmpty = false;
            int i = 0;
            int j = 0;
            for(i = 0; i < board.length; i++){
                for(j = 0; j < board[0].length; j++){
                    if(board[i][j] == '.'){
                        hasEmpty = true;
                        break;
                    }
                }
                if(hasEmpty)
                    break;
            }
            if(!hasEmpty){
                return true;
            }
            for(int k = 1; k <= 9; k++){
                if(isSafe(board, i, j, k)){
                    board[i][j] = (char)(k + 48);
                    System.out.println("\033[H\033[2J");
                    print(board);
                    if(isValidSudoku(board)){
                        return true;
                    }
                    else{
                        board[i][j] = '.';
                    }
                }
            }
            return false;
        }
    
        private static void print(char[][] board) {
            for(int i = 0; i < 9 ; i++){
                for(int j = 0; j < 9; j++){
                    System.out.print(board[i][j]+"\t");
                }
                System.out.println();
            }
        }

        public static boolean isSafe(char[][] board,int i,int j,int k){
            int x = i/3;
            int y = j/3;
            for(int l = 0; l < 9; l++){
                if(board[i][l] == (char)(k+48) || board[l][j] == (char)(k+48))
                    return false;
            }
            for(int l = x*3; l < 3 + 3*x; l++){
                for(int m = y*3; m < 3 + 3*y; m++){
                    if(board[l][m] == (char)(k + 48))
                        return false;
                }
            }
            return true;
        }
    }
}
