package backtracking;

public class find_subsets {

    public static void findsubsets(String str,int index,String ans){
        //base conditon
        if(index==str.length()){
            if(ans.length()==0){
                System.out.println("Null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //recursion
        //yes choice
        findsubsets(str,index+1,ans+str.charAt(index));
        //no choice
        findsubsets(str,index+1,ans);
    }
    public static void main(String[] args) {
        String str="abc";
        findsubsets(str, 0, "");
    }
}
