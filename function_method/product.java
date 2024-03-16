package function_method;

import java.util.Scanner;

public class product {
    public static int multipy(int num1,int num2){
        return num1*num2;
    }

    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int product=multipy(a,b);
        System.out.println(product);
    }

}
