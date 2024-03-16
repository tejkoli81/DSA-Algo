package Sorting;
import java.util.*;
public class insertionsort {

    public static void insertion(int arr[]){
            for(int i=0;i<arr.length;i++){
                int current=arr[i];
                int previous=i-1;
                while(previous>=0 && arr[previous]>current){
                    arr[previous+1]=arr[previous];
                    previous--;
                }

                arr[previous+1]=current;
            }

    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    } 
    public static void main(String[] args) {
        int arr[]={2,3,4,1,5};
        
        insertion(arr);

        // Arrays.sort(arr);
        print(arr);
    }
}
