package advanced_patterns;

import java.util.Scanner;

public class hallow_rect {

    public static void hollow_Rect(int totrows,int totcols){
            for(int i=1;i<=totrows;i++){ //outer loop for rows
                
                for(int j=1;j<=totcols;j++){ //inner loop for cols
                    //cell[i,j];
                    if(i==1 || i==totrows || j==1||j==totcols){ //condition  for boundary rows and cols 
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println( );
            }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        hollow_Rect(rows, cols);
    }
    
}
