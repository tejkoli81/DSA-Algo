package condition_statment;

import java.util.Scanner;

public class weekday {
    public static void main(String[] args) { 
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number(1-7)");
        int num=sc.nextInt();
        switch(num){
            case 1:
                    System.out.println("Monday");
                    break;
            case 2:
                    System.out.println("Tuesday");
                    break;
            case 3:
                    System.out.println("Wednesday");
                    break;
            case 4:
                    System.out.println("thursday");
                    break;
            case 5:
                    System.out.println("Friday");
                    break;
            case 6:
                    System.out.println("saturday");
                    break;
            case 7:
                    System.out.println("Sunday");
                    break;
            default:
                    System.out.println("invaild entry");
                    break;  
        }
    }
    
}
