package advanced_patterns;

import java.util.Scanner;

public class inverted_pyramid {

    public static void inverted_rotated_pyramid(int n){

        for(int i=0;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        inverted_rotated_pyramid(rows);

    }
}
