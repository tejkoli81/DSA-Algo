package recursion;

public class first_occurence_in_arr {
    public static int firstocc(int arr[],int key,int i){
      
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }

        return firstocc(arr,key,i+1);
}
    public static void main(String[] args) {
        int  arr[] = {2, 3,4,5,2,34,5,7,3,1,};
        int key=5;
        System.out.println(firstocc(arr,key,0));
    }
}
