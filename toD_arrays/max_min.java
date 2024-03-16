package toD_arrays;

import java.util.Scanner;

public class max_min {
    public static void maxmin(int arr[][]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){ //arr[0].length :how the length of row = no of cols
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("maximum element is:"+max);
        System.out.println("minimum element is:"+min);
        

    }
    //printing the 2D array
    public static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }
    

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int rows=sc.nextInt();
        int col=sc.nextInt();
        int arr [][]=new int [rows][col];
        //int m=arr.length;
        //int n=arr[0].length;//show the length of row = no of cols
        System.out.println("enter the element:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        maxmin(arr);
    }
}
