package Bit_manpulation;

import java.util.Scanner;

public class set_bit {
     public static int setbit(int a,int i){
        int bitmask=1<<i;
        return a | bitmask;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int a=sc.nextInt();
        System.out.println("enter the postion ");
        int i=sc.nextInt();
        System.out.println(setbit(a,i));
        
    }
}
