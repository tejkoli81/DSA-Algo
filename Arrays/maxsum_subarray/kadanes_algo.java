package Arrays.maxsum_subarray;


///  TIME COMPLEXITITY IS  O(N)  which is better than brute force O(N³) and prefix method O(N²)
/// this method is also as Kadanes Algothrim




public class kadanes_algo {

    public static void kadane(int num[]){
        int currentsum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            currentsum=currentsum+num[i];
            if(currentsum<0){
                currentsum=0;
            }
            if(currentsum>max){
                max=currentsum;
            }
        }
        System.out.println("sum of max sub array is :"+max);
    }
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        // int size =sc.nextInt();
        int arr[]={1,-2,6,-1,3};

        // for(int i =0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();   
        // }

        kadane(arr);

        
    }
}
