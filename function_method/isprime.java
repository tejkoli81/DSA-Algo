package function_method;
import java.util.Scanner;

public class isprime {
    // public static void prime(int number){
    //     for(int i=2;i<=Math.sqrt(number);i++){
    //         if(number%i==0){
    //             System.out.println(number+" is not  prime");
    //         }
    //         else{
    //             System.out.println(number+" is prime");
    //         }
            
    //     }
    // }
    public static boolean prime(int number){
        //corner case
        if(number==2){
            return true; 
        }
        for(int i=2;i<=Math.sqrt(number);i++){ //n= √n*√n 
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(prime(num));


    }
}
