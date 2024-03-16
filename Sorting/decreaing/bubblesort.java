package Sorting.decreaing;

public class bubblesort {
    public static void bubble(int arr[]){
        for(int i=0;i<arr.length;i++){
            int swap=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    swap++;
                }
            }
         }
    }
    

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};

        bubble(arr);
        print(arr);
    }
}
