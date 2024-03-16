package Arrays.maxsum_subarray;

import java.util.Scanner;

public class trappedrainwater {
    public static void trapwater(int height[]){
        int n=height.length;
        int leftmax[]=new int [n];
        int rightmax[]=new int [n];

        leftmax[0]=height[0];
        //calculate left max Boundary 
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }

        //calculate right max boundary
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }

        //loop 

        int trapped=1;
        for(int i=0;i<n;i++){
            int waterlvl=Math.min(leftmax[i], rightmax[i]);
            // trapped+=waterlvl+height[i];

        }
        System.out.println(trapped);
    }
    public static void main(String[] args) {
        //  Scanner sc =new Scanner(System.in);
        // int size =sc.nextInt();
        // int arr[]=new int[size];

        int arr[]={1,8,6,2,5,4,8,3,7};

        // for(int i =0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();   
        // }
        trapwater(arr);
    }

}
