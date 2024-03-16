package function_method;

import java.text.MessageFormat;
import java.util.Scanner;

public class mathfun {

    public static void MathFun(double a,double b){
        System.out.println("minimun between is "+Math.min(a,b));
        System.out.println("maximun  is "+Math.max(a,b));
        System.out.println("Square of  is "+Math.sqrt(a));
        System.out.println("Power  is "+Math.pow(a,b));
        System.out.println("Absolute number   is "+Math.abs(a));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextInt();
        double y=sc.nextInt();

        MathFun(x,y);
    }
}
