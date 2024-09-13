package backtracking;

public class Sudoku {
    public static Boolean solveSudoku(char [][] board,int row,int col){
        //base condition 

    if(row==9){
        return true;
    }
    //recursion
    int nextrow=row , nextcol=col+1;
    if(col+1==9){
        nextrow =row+1;
        nextcol=0;
    }
    
    if(board[row][col]!='.'){
        return solveSudoku(board,nextrow,nextcol);
    }
    
    for(int digit=1;digit<=9;digit++){
        if(isSafe(board,row,col,digit)){
            board[row][col]= (char)(digit+'0');
            if(solveSudoku(board, nextrow, nextcol)){
                return true;
            }
            else{board[row][col]='.';}// undo
        }
    }
        return  false;

    }
    

    public static boolean isSafe(char board[][],int  r,int c,int digit){
        //row 
        for(int i=0;i<9;i++){
            if(board[r][i]==(char)(digit+'0')){
                return false;
            }
        }
        //column 
        for(int i=0;i<9;i++){
            if(board[i][c]==(char)(digit+'0')){
                return false;
            }
        }

        //gird
        int  rowStart=r/3*3;
        int colStart=c/3*3;

        for(int i=rowStart;i<rowStart+3;i++) {
            for(int j=colStart;j<colStart +3;j++) {
                if(board[i][j] ==(char)(digit+'0')) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printSudoku(char [][]board){
        for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
                System.out.print(board[i][j]+" ");
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        char[][] board = { {'.', '8', '7', '6', '5', '4', '3', '2', '1'},
        {'2', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'3', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'4', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'5', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'6', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'7', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'8', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'9', '.', '.', '.', '.', '.', '.', '.', '.'}
};

      solveSudoku(board,0,0);
      if(solveSudoku(board, 0, 0)){
        System.out.println("solution exists");
        printSudoku(board);
      }
      else{
        System.out.println("not exist");
      }
    }
}
