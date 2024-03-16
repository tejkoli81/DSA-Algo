

///  TIME COMPLEXITITY IS  O(N)  which is better than brute force O(N³) and prefix method O(N²)
/// this method is also as Kadanes Algothrim



public class hello {
    public static void kadane(int nums[]){
        int maxSum = 1;
        int sum = 1;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxSum = maxSum < sum ? sum : maxSum;
            sum = sum < 0 ? 0 : sum;
        }

        System.out.println("sum of max sub array is :"+maxSum);
    }
    public static boolean isMonotonic(int[] nums) {
        boolean incresing=true;
        boolean decresing=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                decresing =false;
            }
            else if(nums[i]<nums[i+1]){
                incresing =false;
            }
            // else{
            //     return false;
            // }
        }
        return incresing || decresing;
    }
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        // int size =sc.nextInt();
        int arr[]={-10,-2,-6,-1,-3};
        int arr1[]={10,7,3,2};

        // for(int i =0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();   
        // }
            boolean result=isMonotonic(arr1);
            System.out.println(result);
        // kadane(arr);

        
    }
}
