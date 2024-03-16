package Arrays;

import java.util.Scanner;

public class binary_search {

    public static int binarysearch(int num[],int key ){
        int start=0;
        int end=num.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if(num[mid]==key){
                return mid;
            }

            
            if(num[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={4,5,6,7,1,2};
        int key=sc.nextInt();

        int index= binarysearch(arr,key);
        if(index==-1){
            System.out.println("element is not found");
        }
        System.out.println("element is found at position :"+index);
    }
    
}
