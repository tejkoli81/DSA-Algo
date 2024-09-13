package Strings;

public class length_print{
    public static void printstr(String str){
        String str1=str.trim();
        int count=0;
        // for(int i=0;i<str1.length();i++){
        //     // System.out.print(str1.charAt(i));
        // }
        System.out.println(str1.length());
        for(int i=str1.length()-1;i>0;i--){
            if(str1.charAt(i)==' '){
                
                break;
            }
            System.out.println(str.charAt(i));
            count++;
        }
        System.out.println("count ="+count);

    }
    
    public static void reverse(String str ){
        String str1=str.trim();
        for(int i=str1.length()-1;i>=0;i--){
            System.out.print(str1.charAt(i));
        }
    }
    public static void len(String str ){
        String str1=str.trim();;
        int length=0;
        char Array[]=str1.toCharArray();
        for(char c :Array){
            length++;

        }
        System.out.println(length);
    }
    public static void swap(int a,int b ){
        a=a-b;
        b=a+b;
        a=b-a;
        System.out.println("after swap: a:"+a+"b:"+b);
    }
    public static int  vowel(String str ){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='i'|| str.charAt(i)=='e'||  str.charAt(i)=='o' || str.charAt(i)=='u' ){
                count++;
            }
        }
        return count;
        
    }
    public static boolean prime(int num){
        boolean flag=true;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                flag=false;
            }
        }
        if(flag==true){
            return true;
        }
        return false;

    }
    
    public static void main(String[] args) {
        String str="Tejkumar Koli";
    //swap(1,2);
       // printstr(str);
      // reverse(str);
     // len(str);
      //System.out.println(vowel(str));
      System.out.println(prime(6));
    }
}