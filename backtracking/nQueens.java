package backtracking;


public class nQueens {
     static int count=0;
    public static boolean solveNQ(char board[][],int rows){
        //base case
        if(rows == board.length){
            printboard(board);
            count++;
            return true;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,rows,j)){
            board[rows][j]='Q';
            if(solveNQ(board, rows+1)){
                return true;
            }
            board[rows][j]='x'; // undo the assignment if it doesn't work out;
        }
    }
    return false;
    }
    public static boolean isSafe(char[][] board, int row ,int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1, j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void printboard(char board[][]){
        System.out.println("-----");
      for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
            System.out.print(board[i][j]+" ");
        }
        System.out.println();
      }
    
    }

    public static void main(String[] args) {
        int n=10;
        char board [][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               board[i][j]='x';  //initializing the chessboard with '.'
            }
        }
        solveNQ(board,0);
        System.out.println("no of ways: "+count);
    }
}
