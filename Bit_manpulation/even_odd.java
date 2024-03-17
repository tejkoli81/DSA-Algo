package Bit_manpulation;

import java.util.Scanner;

public class even_odd {
    public static void checkEvenOdd(int a){
        int bitmask=1;
        if((a & bitmask)==0){
            System.out.println(a+" is Even");
        }
        else{
            System.out.println(a + "is Odd");
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();

        checkEvenOdd(a);
    }
}
