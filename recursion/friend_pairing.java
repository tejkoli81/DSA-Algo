package recursion;

public class friend_pairing {
    public static int firendpair(int n){
        if(n==1 || n==2){
            return n;
        }
        // int single=firendpair(n-1);
        // int pair=firendpair(single*(n-2));
        // return single+pair; 
        return firendpair(n-1)+ firendpair(n-1)*firendpair(n-2);
    }
    public static void main(String[] args) {
        System.out.print(firendpair(3));
    }
}
