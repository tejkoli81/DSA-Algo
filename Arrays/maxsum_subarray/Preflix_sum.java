package Arrays.maxsum_subarray;

import java.util.Scanner;


///  TIME COMPLEXITITY IS  O(N²)  which is better than brute force O(N³)
/// this method is also as Prefix  method



public class Preflix_sum {

    public static void preflixsum(int num[]){
        int max=Integer.MIN_VALUE;
        int currsum=0;
        
        int preflix[]=new int[num.length];
        preflix[0]=num[0];
        for(int i=1;i<num.length;i++){
            preflix[i]=preflix[i-1]+num[i];
        }
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                if(start==0){
                    currsum=preflix[end];
                }
                else{
                    currsum=preflix[end]-preflix[start-1];
                }
            }
            if(currsum>max){
                max=currsum;
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

        preflixsum(arr);

        
    }
}
