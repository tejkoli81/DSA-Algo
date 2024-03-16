package Arrays.maxsum_subarray;



///  TIME COMPLEXITITY IS  O(N)  which is better than brute force O(N³) and prefix method O(N²)
/// this method is also as Kadanes Algothrim

///with Special case



public class kadane_special {

    public static void kadane(int nums[]){
        int maxSum = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxSum = maxSum < sum ? sum : maxSum;
            sum = sum < 0 ? 0 : sum;
        }

        System.out.println("sum of max sub array is :"+maxSum);
    }
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        // int size =sc.nextInt();
        int arr[]={-10,-2,-6,-1,-3};

        // for(int i =0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();   
        // }

        kadane(arr);

        
    }
}
