package recursion;

public class digits_into_word {
    public static void digitsintoword(int n){
        String arr[]={"zero","one","two","third","four","five","six","seven","eight","nine"};
        if (n==0) return ;
        int diigt=n%10;
        digitsintoword(n/10);
        System.out.println(arr[diigt]);
    }
    public static void main(String[] args) {
        int n=1234;

        digitsintoword(n);
        
    }
}
