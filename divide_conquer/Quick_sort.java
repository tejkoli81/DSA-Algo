package divide_conquer;

public class Quick_sort {
    public static void quicksort(int arr[],int srt,int end){
        //base condition
        if(srt>=end){
            return;
        }
        int pivot=partition(arr,srt,end);  //sorting function
        quicksort(arr, srt, pivot-1); //left part
        quicksort(arr, pivot+1, end);//right part
    }
    public static int partition(int arr[],int srt,int end){
        int pivot=arr[end];  //last element
        int i=srt-1; 
        for(int j=srt;j<end;j++){
            if(arr[j]<=pivot){
                i++;
                //swap values
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        //swap pivot
        int temp=pivot;
        arr[end]=arr[i];
        arr[i]=temp;
        return i;

    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        
        int arr[]={34,2,13,3,9};
    
        quicksort(arr,0,arr.length-1);
        printarr(arr);
    }
    }
