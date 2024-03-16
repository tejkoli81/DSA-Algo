package toD_arrays;

public class search_sorted_mtrx {

    public static void searchsort(int arr[][],int key){
        int n=arr.length-1;///no of rows 
        int m=arr[0].length-1;///no of columns
        if(n>=m){
            int row =0;
            int col=arr[0].length-1;
            
            while(row<arr.length && col>=0){
                if(arr[row][col]==key){
                    System.out.println("found at position ["+row+" "+col+"]");
                    break;
                }
                else if(key>arr[row][col]){
                    row++;
                }
                else if (key<arr[row][col]){
                    col--;
                }
                else{
                    System.out.println("Not Found");
                }
                
            }
        }
        else{
            int col =0;
            int row=arr.length-1;
            while(col<arr.length && row>=0){
                if(arr[row][col]==key){
                    System.out.println("found at position ["+row+" "+col+"]");
                    break;
                }
                else if(key>arr[row][col]){
                    col++;
                }
                else if (key<arr[row][col]){
                    row--;
                }
                else{
                    System.out.println("Not Found");
                }
                
            }


        }

    }
    public static void main(String[] args) {
        
        int arr[][]={{10, 20, 30, 40},
        {15, 25, 35, 45},
        {27, 29, 37, 48},
        {32, 33, 39, 50}};
    
        int key=33;
        searchsort(arr,key);
    }
}
