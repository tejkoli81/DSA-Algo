package function_method;

import java.util.Scanner;

public class even {
    public static Boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        System.out.println(isEven(n));
    }
}
