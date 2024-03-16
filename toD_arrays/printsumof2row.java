package toD_arrays;

public class printsumof2row {
    public static void sum2rowinarry(int arr[][]){
        int sum=0;
            for(int j=0;j<arr[0].length;j++){
                    sum+=arr[1][j];
            }
        
        System.out.println("the sum of 2 row in array is :"+sum);
    }
    public static void main(String[] args) {
        int arr[][]={{1,4,9},{11,4,3},{2,2,3}};
    
        sum2rowinarry(arr);
    }
}
