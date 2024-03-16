package Arrays;

import java.util.Scanner;

public class sum_subarray {
     public static void printsubarr(int num[]){
         int total=0;
         for(int i=0;i<num.length;i++){
             int start=i;
             for(int j=i;j<num.length;j++){
                 int end =j;
                 int sum=0;
                 System.out.print("[");
                for(int k=start;k<=end;k++){
                    sum=sum +num[k];
                    System.out.print(num[k]+",");
                }
                System.out.print("]");
                total++;
                System.out.print(": sum of array is"+sum);
            System.out.println();
        }
    }
    System.out.println("total no of sub arrays are "+total);

     }

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();

        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        printsubarr(arr);
    }
}
