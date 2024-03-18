package recursion;

public class Print_decreasing_num {
    public static void main(String[] args) {
        Printnum n1=new Printnum();
        n1.printincreasingNum(10);
    }
}


class Printnum{
     //Tradiration Method
//      public void  printDecreasingNum(int n){
//         for(int i=n;i>0;i--){
//             System.out.println(i);
//         }
//      }

    public void  printDecreasingNum(int n){ // recursvie method
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.print(n+" ");
        printDecreasingNum(n-1);
    }

    public void  printincreasingNum(int n){ // recursvie method
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printincreasingNum(n-1);
        System.out.print(n+" ");
    }
       
 }