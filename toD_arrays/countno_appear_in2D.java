package toD_arrays;

public class countno_appear_in2D {
    public static void countnoinarry(int arr[][],int no){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==no){
                    count++;
                }
            }
        }
        System.out.println("the number "+no+" occurred in array is :"+count);
    }
    public static void main(String[] args) {
        int arr[][]={{4,7,8},{8,8,7}};
        int key=8;
        countnoinarry(arr, key);
    }
}
