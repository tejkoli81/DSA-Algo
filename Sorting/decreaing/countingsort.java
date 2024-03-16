package Sorting.decreaing;

public class countingsort {
    public static void counting(int num[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            largest=Math.max(largest, num[i]);
        }
        int count[]=new int[largest+1];

        for(int i=0;i<num.length;i++){
            count[num[i]]++;
        }
        
        int j=num.length-1;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                num[j]=i;
                j--;
                count[i]--;

            }
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    } 
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};;
        
        counting(arr);
        // Arrays.sort(arr);
         print(arr);
    }
}
