package advanced_patterns;

import java.util.Scanner;

public class flods_triangle {

    public static void flod(int num){
        int n=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        flod(rows);
    }
}
