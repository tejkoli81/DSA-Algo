package recursion;

public class Sum_of_nat_num {
    public static int  sumofnatural(int n){
        if(n==1){
            return 1;
        }
        int summ=sumofnatural(n-1);
        int sum=n+summ;
        return sum;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumofnatural(n));
    }
}
