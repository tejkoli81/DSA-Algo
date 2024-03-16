package loops;

import java.util.Scanner;

public class break_10x {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            int num=sc.nextInt();
            if(num%10==0){
                continue;
            }
            System.out.println(num);
        }while(true);
       
    }
}
