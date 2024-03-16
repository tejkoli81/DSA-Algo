package Sorting;

public class bubblesort {

    public static void bubble(int num[]){
        for(int turn=0;turn<num.length;turn++){
            int swap=0;
            for(int j=0;j<num.length-1-turn;j++){
                    if(num[j]>num[j+1]){
                        int temp=num[j+1];
                        num[j+1]=num[j];
                        num[j]=temp;
                        swap++;
                    }
                 if(swap==0){
                    break;
                 }
            }
            
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    } 
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        bubble(arr);
        print(arr);
    }
}
