package Bit_manpulation;

import java.util.Scanner;

public class get_bit {
     public static void check1_0(int a,int i){
        int bitmask=1;
        if((a & (bitmask<<i))==0){
            System.out.println(a+" is 0");
        }
        else{
            System.out.println(a + "is 1");
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number ");
        int a=sc.nextInt();
        System.out.println("enter the postion ");
        int i=sc.nextInt();


        check1_0(a,i);
    }
}
