package Arrays.maxsum_subarray;

import java.util.Scanner;


///  TIME COMPLEXITITY IS  O(N³)  which is Worst case
/// this method is also as Brute Force





public class Brute_force {
    public static void printmaxsumarr(int num[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                        sum=sum+num[k];
                }
                if(sum>max){
                    max=sum;
                }
            }
        }
        System.out.println("sum of max sub array is :"+max);
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
        printmaxsumarr(arr);

    }
}
