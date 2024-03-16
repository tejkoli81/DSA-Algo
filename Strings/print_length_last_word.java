package Strings;

public class print_length_last_word {
    public static void lengthlast(String str){
         int len=0;
         str=str.trim();
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                break;
            }
            len++;
        }
        System.out.println(len);

    }
    public static void main(String[] args) {
        String str="luffy is still joyboy ";

        lengthlast(str);
        // System.out.println(len);
    }
}
