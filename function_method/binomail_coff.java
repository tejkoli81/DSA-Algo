package function_method;

import java.util.Scanner;

public class binomail_coff {
    public static int fact(int number){
        int f=1;
        for(int i=1;i<=number;i++){
            f=f*i;
        }
        return f;
    }
    public static int binomial(int n,int r){
        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_nr=fact(n-r);
        int binomial_cff=fact_n/(fact_r *fact_nr);
        return binomial_cff;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int result=binomial(n, r);
        System.out.println(result);

    }
}
