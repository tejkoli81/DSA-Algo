package loops;

import java.util.Scanner;

public class sum_even_odd {
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            int num;
            int sumeven=0;
            int sumodd=0;
            int choice;

            do{
                System.out.println("enter the integer");
                num=sc.nextInt();
                if(num%2==0){
                    sumeven+=num;
                }
                else{
                    sumodd+=num;
                }
                System.out.println("press 1 to continue or 0 is exit");
                choice=sc.nextInt();
            }while(choice==1);
            System.out.println("sum of even integer is "+sumeven);
            System.out.println("sum of odd integer is "+sumodd);
        }
}
