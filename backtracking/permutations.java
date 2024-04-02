package backtracking;

public class permutations {
    public static void premut(String str,String ans){
        //base 
        if(str.length()==0) {
            System.out.println(ans);
            return;
        }
        //recurion
        for(int i=0;i<str.length();i++){
            char current=str.charAt(i);
           String newstr=str.substring(0,i)+str.substring(i+1);
            premut(newstr, ans+current);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        premut(str,"");
    }
}
