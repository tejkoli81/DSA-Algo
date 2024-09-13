import java.util.Scanner;

class trail{
  
    public static void main(String[] args) {
        
      int upper,lower;
      Scanner sc=new Scanner(System.in);
      upper=sc.nextInt();
      lower=sc.nextInt();
      double sum=0;
      for(int i=upper;i<=lower;i++){
        sum=sum+Math.pow(i, 3);
    }
    System.out.println((int)(sum));
}
}