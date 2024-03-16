package loops;

import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<=num;i++){
                int rem=num%10;
                System.out.print(rem);
                num=num/10;
                
            }
            System.out.print(num);
        
    }
}
