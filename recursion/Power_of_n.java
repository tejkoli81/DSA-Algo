package recursion;

public class Power_of_n {

    public static double powerOfn(double x,int n){
        if(n==0){
            return 1;
        }
        if(n<0) {
            return (1/powerOfn(x,-n));
        }
        //  int xmn=powerOfn(x, n-1);
        //  int xn=x*xmn;

        // return x*powerOfn(x, n-1);

        //optimized

        double halfpower=powerOfn(x, n/2);
        double power=halfpower * halfpower;
        if(n%2!=0){
            power=x*power;
        }

        return power; 
    }
    public static void main(String[] args) {
        double x=1.0000;        ;
        int n=-2147483648;

        System.out.println(powerOfn(x,n));
    }
}
