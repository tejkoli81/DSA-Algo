package variables_Data_types;
import java.util.Scanner;

 class average {
    public static void main(String[] args) {
        float a,b,c;
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        System.out.println((a+b+c)/3);

    }
}
