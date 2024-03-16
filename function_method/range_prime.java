package function_method;

import java.util.Scanner;

public class range_prime {
    public static boolean prime(int number){
        //corner case
        if(number==2){
            return true; 
        }
        for(int i=2;i<=Math.sqrt(number);i++){ //n= √n*√n 
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    public static void rangePrime(int upper,int lower){
        for(int i=upper;i<=lower;i++){
            if(prime(i)==true){
                System.out.println(i);
            }
            
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the starting range:");
        int upperlimit =sc.nextInt();
        System.out.println("enter the ending range:");
        int lowerlimit =sc.nextInt();

        rangePrime(upperlimit,lowerlimit);
        
    }
}
