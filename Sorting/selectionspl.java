package Sorting;

public class selectionspl {
         public static void selection(char arr[]){
            for(int i=0;i<arr.length-1;i++){
               int minpot=i;
               for(int j=i+1;j<arr.length;j++){
                if(arr[minpot]>arr[j]){
                    minpot=j;
                }
               }
               //swap
               char temp=arr[minpot];
               arr[minpot]=arr[i];
               arr[i]=temp;

            }
         }
        public static void print(char arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        } 
        public static void main(String[] args) {
            char arr[]={'a','c','b','e','d'};
            selection(arr);
            print(arr);
        }
    }
