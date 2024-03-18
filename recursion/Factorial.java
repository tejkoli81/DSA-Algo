package recursion;

public class Factorial {
    public static void main(String[] args) {
        factorial f1=new factorial();
        System.out.println(f1.facto(5));

    }

}

class factorial{
        int facto(int n){
           if(n==0){
           return 1;
           }
           else{
            return n*facto(n-1);
           }
           
        }
}
