package toD_arrays;
import java.util.Scanner;

public class spiral_matrix {

    public static void spiral(int arr[][]){
        int startrow=0;
        int startcol=0;
        int endrow=arr.length-1;
        int endcol=arr[0].length-1;

        while(startrow<=endrow && startcol<=endcol ){
           //top 
            for(int j=startcol;j<=endcol;j++){
                System.out.print(arr[startrow][j]+" ");
            }
            //right
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(arr[i][endcol]+" ");
            }
            //bottom
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(arr[endrow][j]+" ");
            }
            //left
            for(int i=endrow-1;i>=startrow+1;i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(arr[i][startcol]+" ");
            }
            startcol++;
            endcol--;
            startrow++;
            endrow--;
        }
        

        //1,2,3,6,9,8,7,4,5  1,2,3,4,8,12,11,10,9,5,6,7]
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        //  int row,col;
        // Scanner sc = new Scanner(System.in);
        // row=sc.nextInt();
        // col=sc.nextInt();
        // int arr[][]=new int[row][col];
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         arr[i][j]=sc.nextInt();
        //     }
        // } 
        spiral(arr);  
    }
}
