package divide_conquer;

public class merge_sort {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergesort(int arr[],int srt,int end){
        //base condition
        if(srt>=end ){
            return;
        }
        int mid=srt+(end-srt)/2;                       //mid point  of the array
        mergesort(arr,srt,mid);                    // left part of array
        mergesort(arr,mid+1,end);                      // right part of array
        merge(arr,srt,mid,end);                        //sorting function

    }
    public static void merge(int arr[],int srt,int mid,int end){
        int temp[]=new int [end-srt+1];  
        int i=srt;                      //1st part index sorted  subarray
        int j=mid+1;                   //2nd part index sorted subarray
        int k=0;                       // index for temp

        while(i<= mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        //leftover part of 1st subarray
        while(i<=mid){
            temp[k++]=arr[i++];
        }
         //leftover part of 2nd subarray
        while (j<=end) {
            temp[k++]=arr[j++];
            
        }
        //copy temp to original  array
        for( k=0,i=srt;k<temp.length;k++,i++){
        arr[i]=temp[k];
        }



    }
    public static void main(String[] args) {
        int arr[]=new int[]{4,23,67,89,10};
        mergesort(arr, 0,arr.length-1);
        printarr(arr);
    }
}
