package recursion;

public class length_of_string {
    public static int lengthstring(String str){
        String s =str.trim();
        if(s.length()==0){
            return 0;
        }
        return lengthstring(s.substring(1))+1;

    }
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(lengthstring(str));
    }
}
