package Strings;

public class shortestpath {
    public static int shortest(String str){
        str=str.toUpperCase();
        System.out.println(str);
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            char dir=str.charAt(i);
            if(dir=='S'){
                y--;
            }
            else if(dir=='N'){
                y++;
            }
            else if(dir =='W'){
                x--;
            }
            else{
                x++;
            }
        }
        int X1=x*x;
        int Y1=y*y;
        return (int)Math.sqrt(X1+Y1);
    }
    public static void main(String[] args) {
         String str="wnseeessnn";

         int displacement=shortest(str);
         System.out.println(displacement);
        
    }
}
