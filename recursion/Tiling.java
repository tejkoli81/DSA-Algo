package recursion;

public class Tiling {
    public static int  tiling(int n,int m){
        if(n<m){
            return 1;
        }

        // int ver=tiling(n-1,m);
        // int hor=tiling(n-m,m);

        // return  ver+hor;
        return tiling(n-1, m)+tiling(n-m, m);
    }
public static void main(String[] args) {
    int width=4;
    int  height=8;

    System.out.println(tiling(width, height));
    

}
    
}