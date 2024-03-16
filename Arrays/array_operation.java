package Arrays;

import java.util.Scanner;

public class array_operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int rollno[]=new int[size];
        String menu[]=new String[size];

        // System.out.println(menu.length);
        // sc.nextLine();


        //input using for loop
        // for(int i=0;i<menu.length;i++){
        //     menu[i]=sc.nextLine();
        // }
        for(int i=0;i<rollno.length;i++){
            rollno[i]=sc.nextInt();
        }


        //Output using for loop
        // for(int i=0;i<menu.length;i++){
        //     System.out.println(menu[i]);
        // }
        
        System.out.println("position at"+menu[0]);
        for(int i=rollno.length-1;i>=0;i--){
            System.out.println(rollno[i]);
        }

    }
}
