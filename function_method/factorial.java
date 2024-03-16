package function_method;

import java.util.Scanner;



public class factorial {

    public static int fact(int number){
        
       int f=1;
       for(int i=1;i<=number;i++){
        f=f*i;
       }
       return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(fact(num));



    }
}
