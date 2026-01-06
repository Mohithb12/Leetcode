class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                
                if(board[i][j] == '.') continue;

                else
                {
                    
                    for(int n=j+1;n<9;n++)
                    {
                        if(board[i][j] == board[i][n]) return false;
                        else continue;
                    }

                    for(int n=i+1;n<9;n++){
                        if(board[i][j] == board[n][j]) return false;
                        else continue;
                    }

                    int boardRowStrt = (i/3) * 3;
                    int boardColStrt = (j/3) * 3;

                    for(int r = boardRowStrt ;r < boardRowStrt +3;r++){
                        for(int c = boardColStrt ; c < boardColStrt+3;c++){

                            if(i== r && j==c) continue;
                            if(board[r][c] == board[i][j]) return false;
                        }
                    }
                }

            }
        }

        return true;
    }
}