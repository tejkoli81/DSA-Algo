package Sorting;

public class selectionsort {
         public static void selection(int arr[]){
            for(int i=0;i<arr.length-1;i++){
               int minpot=i;
               for(int j=i+1;j<arr.length;j++){
                if(arr[minpot]>arr[j]){
                    minpot=j;
                }
               }
               //swap
               int temp=arr[minpot];
               arr[minpot]=arr[i];
               arr[i]=temp;

            }
         }
        public static void print(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        } 
        public static void main(String[] args) {
            int arr[]={3,6,2,1,8,7,4,5,3,1};
            selection(arr);
            print(arr);
        }
    }
