package Arrays;

import java.util.Scanner;

public class linear_search {

    public static int linearsearch(String arr[],String key){
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(key)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        // int arr[]=new int[n];
        String arr[]=new String[n];
        sc.nextLine();

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextLine();
        }
        System.out.println("enter value to search:");
        String key=sc.nextLine();

        int index=linearsearch(arr,key);

        if(index==-1){
            System.out.println("invaild key");
        }
        System.out.println("elements is found at position :"+index);
    }
}
