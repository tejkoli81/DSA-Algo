class trail{
    static int count=0;
    public static void solveNQ(char board[][],int rows){
        //base case
        if(rows == board.length){
            count++;
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,rows,j)){
            board[rows][j]='Q';
            solveNQ(board, rows+1);
            board[rows][j]='x'; // undo the assignment if it doesn't work out;
        }
    }

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
    

    public static void main(String[] args) {
        int n=1;
        char board [][]=new char[n][n];
        solveNQ(board,0);
        System.out.println("no of ways: "+count);
    }
}