package divide_conquer;

public class count_inversion_arry {
    
    public static int  mergesort(int arr[],int srt,int end){
        //base condition
        int cnt=0;
        if(srt>=end ){
            return cnt;
        }
        int mid=srt+(end-srt)/2;                       //mid point  of the array
        cnt +=mergesort(arr,srt,mid);                    // left part of array
        cnt +=mergesort(arr,mid+1,end);                      // right part of array
        cnt+=merge(arr,srt,mid,end);                        //sorting function
        return cnt;
    }
    public static int merge(int arr[],int srt,int mid,int end){
        int temp[]=new int [end-srt+1];  
        int i=srt;                      //1st part index sorted  subarray
        int j=mid+1;                   //2nd part index sorted subarray
        int k=0;                       // index for temp
        int cnt=0;

        while(i<= mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                cnt +=(mid-i)+1;
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
        return cnt;



    }
    public static int countinversion(int arr[]){
        
        return mergesort(arr,0,arr.length-1);
        

    }
    public static void main(String[] args) {
        int arr[]={2,4,1,3,5};
        System.out.println(countinversion(arr));
    }
}
