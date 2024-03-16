package advanced_patterns;

import java.util.Scanner;

public class butterfly {
    public static void Butterfly(int n){
        for(int i=1;i<=n;i++){
            //Stars
            for(int j=1;j<=i;j++){         //j=i star=i
                System.out.print("*");
            }
            //spaces
            for(int k=1;k<=2*(n-i);k++){   //no of spaces 2*n-i /2*(4-1)=6 
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){           //j=i star=i
                System.out.print("*");
            }
            System.out.println();           //rows breaks
        }

        //2nd half
        for(int i=n;i>=1;i--){
            //Stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();//rows breaks
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        Butterfly(rows);
    }
}
