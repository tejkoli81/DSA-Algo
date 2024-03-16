package advanced_patterns;

import java.util.Scanner;

public class rhombus {
    public static void Rhombus(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int k=1;k<=n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        Rhombus(rows);
    }
}
