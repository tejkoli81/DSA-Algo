package Strings;

public class length_print{
    public static void printstr(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
            count++;
        }
        System.out.println("count ="+count);

    }
    public static void main(String[] args) {
        String str="tejkumar koli";

        printstr(str);
    }
}