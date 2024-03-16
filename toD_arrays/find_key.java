package toD_arrays;

import java.util.Scanner;

public class find_key {

    public static void findKey(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.println("the key is found at"+"["+i+ j+"]");
                }
            }
        }
    }
    public static void main(String[] args) {
        int row,col;
        Scanner sc = new Scanner(System.in);
        row=sc.nextInt();
        col=sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the key to be Found:");
        int key=sc.nextInt();

        findKey(arr,key);
    }
}
