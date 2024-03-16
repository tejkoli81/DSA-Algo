public class power2 {
    public static boolean isPowerOfTwo(int n) {
        if(n==1)return true;
        if((n & (n - 1)) == 0){
            return true;
        }
        else{

            return false;
        }
    }
    public static void main(String[] args) {
        int n=8;
        System.out.println(isPowerOfTwo(n));
    }
}
