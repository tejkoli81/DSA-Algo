import java.util.Scanner;

public class demo {
    // public static boolean containsDuplicate(int[] arr) {
    //    boolean ispresent=false;
    //     for(int i=0;i<arr.length-1;i++){
    //         for(int j=1;j<arr.length;j++) {
    //             if(arr[i]==arr[j]){
    //                 ispresent=true;
    //                 break;
    //             }
    //         }
    //     }
    //   return ispresent;
    // }

    public static boolean pali(int n) {
        int num = n;
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (num == rev) {
            return true;
        }
        return false;
    }
    public static boolean arm(int m){
        int num=m;
        int arms=0;
        while(m>0){
            int rem=m%10;
            arms=arms+(int)(Math.pow(rem, 3));
            m=m/10;
        }
        if(num==arms){
            return true;
        }
        return false;
    }
    public static void fibo(int num){
        int a=0,b=1,c=1;
        for(int i=a;i<num;i++){
            System.out.println(a);
            a=b;
            b=c;
            c=a+b;
        }
       
    }
    public static int fiboc(int num){
        if(num<=1){
            return num;
        }
        return fiboc(num-1) +fiboc(num-2);
    }
    public static void main(String[] args) {
        // int [] arr={1,2,3};
        // System.out.println(containsDuplicate(arr)); 

        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();

        // System.out.println(fibo(num));
for(int i=0;i<num;i++){

    System.out.println(fiboc(i));
}
    
}
}

