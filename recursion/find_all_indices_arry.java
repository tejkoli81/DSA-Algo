package recursion;

public class find_all_indices_arry {
    public static void findallindics(int arr[],int key,int i){
        if(arr ==null ||arr.length==0){
            return;
        }
        if(i==arr.length){
            return;
        }
        if(key==arr[i]){
            System.out.println(i);
        }
        findallindics(arr, key, i+1);


    }
    public static void main(String[] args) {
        int arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key=2;
        findallindics(arr, key ,0);
        
    }
 
}
