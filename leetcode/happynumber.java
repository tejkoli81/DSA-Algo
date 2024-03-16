package leetcode;

public class happynumber {
    public static Boolean isHappy(int n) {
        int num=n;
        int sum=0;
        while(num>0 ){
            int rem=num%10;
            sum=sum+rem*rem;
            num=num/10;
            if(num==0){
                break;
            }
        }
        if(sum!=1){ 
            isHappy(sum);
        }
        if(num == 0){
            return true;
        }

        return false;
             

        
    }
    public static void main(String[] args) {
        int i=2;
        System.out.println(isHappy(i));
    }
}
