package Arrays;

public class repeatno_in_arr {
    public static boolean repeat (int num[]){
        
        for(int i=0;i<num.length;i++){
        for(int j=i+1;j<num.length;j++){
            if(num[i]==num[j]){
                return true;
            }
        }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,5,3,6,4,5};
        System.out.println(repeat(arr));
      
    }
}
