class Solution {

    public static boolean isPossible(char[][] board,int row,int col,int value)
    {
        for(int i = 0;i<9;i++)
        {
            //for rows
            if(board[i][col] == value)return false;

            //for cols
            if(board[row][i] == value)return false;

            //for the sub-box condition
            if(board[(3 * (row/3) + (i/3))][3*(col/3)+(i%3)] == value)return false;
        }

        return true;
    }

    public static boolean sudoku(char[][] board)
    {
        int rows = board.length;
        int cols = board[0].length;

        for(int i = 0;i<rows;i++)
        {
            for(int j =0;j<cols;j++)
            {
                if(board[i][j] == '.') // blank space exists.
                {
                    for(char k = '1';k<= '9';k++)
                    {
                        if(isPossible(board,i,j,k))
                        {
                            board[i][j] =k;
                            if(sudoku(board))return true;
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }

        return true;
    }

    public void solveSudoku(char[][] board) {
        sudoku(board);
    }
}

/*
find the position to fill the value
*** conditions for the values are : 
Each of the digits 1-9 must occur exactly once in each row.
Each of the digits 1-9 must occur exactly once in each column.
Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.

same actions for any other blank but here 
possible issue could the 2nd blank not getting the perfect | valid value to be entered as bcoz 
the 1st blank is miss place so backtracking is something important here so just come backward & have the other value | next value for current entity 
as this scenerio normal iterative won't goes well so be prefer to go with recursion to have the backtracking solution approach to be used here.
 */