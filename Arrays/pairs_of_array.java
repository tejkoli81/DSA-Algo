package Arrays;

import java.util.Scanner;

public class pairs_of_array {
    public static void pairs(int num[]){
        int tp=0;           // arr[n]= n(n+1)/2 pairs will generated

        for(int i=0;i<num.length;i++){
            int current=num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+current+","+num[j]+"),");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total of pairs :"+tp);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();

        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        pairs(arr);

    }
}
