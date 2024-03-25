package divide_conquer;

public class majority_element {
    public static int majority(int arr[]){
        int el=arr[0];
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(count == 0){
                count=1;
                el=arr[i];
            }
            else if (arr[i]==el){
                count++;
            }
            else{
                count--;
            }

        }
        int counter=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==el){counter++;}
        }
        if(counter>arr.length/2)return el;
        return -1;

    }
    public static void main(String[] args) {
        
        int arr[]={2,2,1,1,1,2,2};
        System.out.println(majority(arr));
    }
}
