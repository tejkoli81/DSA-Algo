package Arrays;

import java.util.*;

public class largest_in_array{

    public static int largestarray(int arr[]){
        int large=Integer.MIN_VALUE;           //equal to -infinity
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        return large;
    }
    public static int smallestarray(int arr[]){
        int small=Integer.MAX_VALUE;           //equal to +infinity
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        return small;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :");
        int size=sc.nextInt();

        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int largest=largestarray(arr);
        System.out.println("largest elements is "+largest);

        int smallest=smallestarray(arr);
        System.out.println("smallest elements is "+smallest);

    }
}