package backtracking;

public class Sudoku {
    public static Boolean solveSudoku(int [][] board,int row,int col){
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
    
    if(board[row][col]!=0){
        return solveSudoku(board,nextrow,nextcol);
    }
    
    for(int digit=1;digit<=9;digit++){
        if(isSafe(board,row,col,digit)){
            board[row][col]= digit;
            if(solveSudoku(board, nextrow, nextcol)){
                return true;
            }
            board[row][col]=0;// undo
        }
    }
        return false;

    }
    

    public static boolean isSafe(int board[][],int  r,int c,int num){
        //row 
        for(int i=0;i<9;i++){
            if(board[r][i]==num){
                return false;
            }
        }
        //column 
        for(int i=0;i<9;i++){
            if(board[i][c]==num){
                return false;
            }
        }

        //gird
        int  rowStart=r/3*3;
        int colStart=c/3*3;

        for(int i=rowStart;i<rowStart+3;i++) {
            for(int j=colStart;j<colStart +3;j++) {
                if(board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printSudoku(int [][]board){
        for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
                System.out.print(board[i][j]+" ");
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        int [][] board = {  {5,3,0,0,7,0,0,0,0},
        {6,0,0,1,9,5,0,0,0},
        {0,9,8,0,0,0,0,6,0},
        {8,0,0,0,6,0,0,0,3},
        {4,0,0,8,0,3,0,0,1},
        {7,0,0,0,2,0,0,0,6},
        {0,6,0,0,0,0,2,8,0},
        {0,0,0,4,1,9,0,0,5},
        {0,0,0,0,8,0,0,7,9}
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
