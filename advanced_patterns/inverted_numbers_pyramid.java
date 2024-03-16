package advanced_patterns;

import java.util.Scanner;

public class inverted_numbers_pyramid {
    public static void inverted_numbers_pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        inverted_numbers_pyramid(rows);
    }
}
