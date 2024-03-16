package function_method;

import java.util.Scanner;

public class palidrome {
    public static Boolean isPali(int num){
        int og=num;
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10; 
        }
        if(og==rev){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPali(n));
    }
}
