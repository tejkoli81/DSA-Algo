package function_method;

import java.util.Scanner;

public class decimal_to_binary {

    public static void toBin(int number){
        int ognum=number;
        int bin=0;
        int pow=0;
        while(number>0){
            int rem=number%2;
            bin=bin+rem*(int)Math.pow(10, pow);
            pow++;
            number=number/2;
        }
        System.out.println(ognum+" to binary = "+bin);

    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        toBin(num);
    }
}
