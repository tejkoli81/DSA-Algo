package function_method;

import java.util.Scanner;

public class binary_to_decimal {

    public static void toDec(int number){
        int ognum=number;
        int dec=0;
        int pow=0;
        while(number>0){
            int last=number%10;
            dec=dec+(last*(int)Math.pow(2, pow));
            pow++;
            number=number/10;
        }
        System.out.println(ognum+" to decimal = "+dec);
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        toDec(num);

    }
}
