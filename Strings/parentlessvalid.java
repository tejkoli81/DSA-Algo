package Strings;

public class parentlessvalid {
    public static void main(String[] args) {
        String s="() [] {}";
        int c[]=new int[s.length()];
        for(int i=0;i<s.length()-2;i++){
             c[s.charAt(i)]++;
        }
        for(int i=0;i<c.length-1;i++){
            System.out.println(i);
        }
    }
}
