package backtracking;

public class grid_ways {;
    public static int gridways(int i,int j,int m,int n){

        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 || j==m-1){
            return 1;
        }
        int way1=gridways(i, j+1, m, n);
        int way2=gridways(i+1, j, m, n);
        return way1+way2;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(gridways(0,0,n,m));

    }
}
