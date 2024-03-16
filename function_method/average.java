package function_method;

import java.util.Scanner;

public class average {

    public static float ave(int a,int b,int c){
       float aver=(a+b+c)/3;
       return aver;
    }
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    System.out.println("average is: "+ave(a,b,c));

}
}
