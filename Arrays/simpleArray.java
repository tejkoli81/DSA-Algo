package Arrays;

import java.util.Scanner;

public class simpleArray {
    public static void main(String[] args) {
        /*
         Creating the array 
         1. DataType array_name[] = new datatype[size];
         2. Datatype array_name[] = {values}; 
         3. Datatype[] array_name={values}; 
         4. Datatype[] array_name=new datatype[size]; 
         */

         //example 1
         int marks[]=new int[50];

         //example 2
         String fruits[]={"mango","apple"}; 
         float prices[]={13.45f,14,5.3f}; 
         int[] items=new int[10];

        Scanner sc=new Scanner(System.in);

        int phy=marks[0];
        int chem=marks[1];
        int math=marks[2];

        phy=sc.nextInt();
        chem=sc.nextInt();
        math=sc.nextInt();

        System.out.println("phy:"+phy);
        System.out.println("chem:"+chem);
        System.out.println("math:"+math);

        int percent=(phy+chem+math)/3;
        System.out.println("Percentage : "+percent+"%");



        

    }
}
