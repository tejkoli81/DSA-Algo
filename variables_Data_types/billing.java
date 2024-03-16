package variables_Data_types;

import java.util.Scanner;

public class billing {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the cost of pencil:");
        float a=sc.nextFloat();
        System.out.println("Enter the cost of pen:");
        float b=sc.nextFloat();
        System.out.println("Enter the cost of easer:");
        float c=sc.nextFloat();
        float total=((a+b+c)+(a+b+c)*0.18f);
        System.out.println("Total amount is :"+total);
    }
}
