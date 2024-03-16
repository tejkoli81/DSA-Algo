package Strings;

import java.util.Scanner;



public class string_palidorme {
    public static  Boolean palidromestring(String str){
        str=str.toLowerCase();
        int n=str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        str=str.replaceAll("[^a-zA-Z0-9]","");
       System.out.println(palidromestring(str));
    }
}
