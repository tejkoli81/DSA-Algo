package divide_conquer;

public class search_sorted_array {

    public static int searchsort (int[] arr, int target,int srt,int end) {
        if(srt>end){
            return -1;
        }
        int mid=srt+(end-srt)/2;

        if(arr[mid]==target){
            return mid;
        }
        //case 1 on line 1;
        if(arr[srt]<=arr[mid]){
            //case a
            if(arr[srt]<=target && target<=arr[mid]){
                return searchsort(arr, target, srt, mid-1);
            }
            //case b
            else{
                return searchsort(arr, target, mid+1, end);
            }
        }
        //case 2 on line 2
        else{
            //case c
            if(arr[mid]<=target && target<=arr[end]){
                return searchsort(arr, target, mid+1, end);
            }
            //case d
            else{
                return searchsort(arr, target, srt, mid-1);
            }
    }
}
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=4;

        System.out.println(searchsort(arr,target,0,arr.length-1));
    }
}
