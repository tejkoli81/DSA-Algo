package toD_arrays;

public class diagonal_matrix {
    public static void brute_diagonal(int arr[][]){
            int sum=0;
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    if(i==j){
                        sum+=arr[i][j];
                    }
                    if(i+j==arr.length-1){
                        if(i!=j){

                            sum+=arr[i][j];
                        }
                    }
                }
            }
            System.out.println("Sum is :"+sum);
        }
    
    public static void optimize_diagonal(int arr[][]){
            int sum=0;
            for(int i=0;i<arr.length;i++){
                    sum+=arr[i][i];
                if(i!=arr.length-1-i){
                    sum+=arr[i][arr.length-1-i];
                }
            }
            System.out.println("Sum is "+sum);
    }
        public static void main(String[] args) {
            int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

            optimize_diagonal(arr);
        }
}
