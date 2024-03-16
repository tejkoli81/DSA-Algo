package function_method;

import java.util.Scanner;

public class sum_of_integer {
    public static void sumofdigits(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("the sum of digits is "+sum);
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sumofdigits(n);
    }
}
