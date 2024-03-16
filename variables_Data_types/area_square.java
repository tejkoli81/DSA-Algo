package variables_Data_types;

import java.util.Scanner;

public class area_square {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        float side=sc.nextFloat();
        float area=(float)side*side;
        System.out.println(area);
    }
}
