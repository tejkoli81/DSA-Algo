package Arrays;

import java.util.Scanner;



public class reverse_array {
    public static void reverse(int num[]){
        int front=0;
        int rear=num.length-1;
        while (front<rear) {
            int temp =0;
            temp=num[front];
            num[front]=num[rear];
            num[rear]=temp;
            front++;
            rear--;
        }


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the size of array");
        int size=sc.nextInt();

        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr);
        System.out.println("reverse array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        




        
    }
}
