package condition_statment;

import java.util.Scanner;

public class postive_negative {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();

        if(num<0){
            System.out.println("Negative number");
        }
        else if(num>0){
            System.out.println("Postivie Number");
        }
        else{
            System.out.println("Number is zero");
        }
    }
}
