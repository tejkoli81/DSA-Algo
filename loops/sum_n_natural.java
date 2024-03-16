package loops;

import java.util.Scanner;

public class sum_n_natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        int sum=0;
        int i=0;
        while(i<=num){
            sum+=i;
            i++;
        }
        System.out.println(sum);

    }
}
