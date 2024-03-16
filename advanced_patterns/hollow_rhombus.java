package advanced_patterns;

import java.util.Scanner;

public class hollow_rhombus {
    public static void Hollow_rhombus(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //boundary stars
            for(int k=1;k<=n;k++){
                if(i==1 || i==n || k==1||k==n){ //condition  for boundary rows and cols 
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        Hollow_rhombus(rows);
    }
}
