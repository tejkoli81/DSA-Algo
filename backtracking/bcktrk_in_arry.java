package backtracking;

public class bcktrk_in_arry {
    public static void changearr(int arr[],int index,int value){
        //base
        if(index== arr.length){
            printarr(arr);
            return ;
        }
        //recursive
        arr[index]=value;
        changearr(arr, index+1, value+1);
        //backtracking step
        arr[index]=arr[index]-2;
    }
    public static void printarr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int [5];
        changearr(arr,0,1);
        printarr(arr);
    }
}
