package loops;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long num=sc.nextLong();
        boolean flag=true;
        for(long i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                flag=false;
            }
        }
        if(flag==true){
            System.out.println(num+" is prime");
        }
        else{
            System.out.println(num+" is not a prime");
        }
    }
}
