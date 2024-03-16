package toD_arrays;

public class transpose_of_matrix {
    public static void transpose(int arr[][]){
        int row=arr.length;
        int col=arr[0].length;
        int trans[][]=new int [col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                trans[j][i]=arr[i][j];
            } 
         }
         print(trans);
        
        
    }
    public static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
             System.out.print(arr[i][j]+" ");
            } 
            System.out.println();
         }

    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        print(arr);
        transpose(arr);
        System.out.println();
       
        
    }
}
