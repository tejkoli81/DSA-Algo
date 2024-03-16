package Sorting.decreaing;

public class selectionsort {
    public static void selection(int arr[]){
        for(int i=0;i<arr.length;i++){
            int maxpt=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[maxpt]){
                    maxpt=j;
                }
            }
            int temp=arr[maxpt];
            arr[maxpt]=arr[i];
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
