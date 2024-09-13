package Arrays;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class  largrst_smallest2{
    public static void pair(int arr[]){
        int count=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
         
            for(int j=i;j<arr.length;j++){
                int end =j;
                   int currsum=0;
                for(int k=start;k<=end;k++){
                 currsum+=arr[k];
                }
                if(currsum >maxsum){
                maxsum=currsum;
            }
            }
            

        }
        System.out.println(maxsum);
    }
    public static void seclar(int arr[]){
        int largest=arr[0];
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                 second=largest;
                largest=arr[i];
               
            }
            else if (arr[i]<largest && arr[i]> second){
                second=arr[i];
            }
            
        }
        System.out.println(second);
    }
    public static void secsm(int arr[]){
        if(arr.length==1){
            System.out.println(arr[0]);
        }
        else{
            int smallest=arr[0];
            int second= Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]<smallest  && smallest!=second){
                    second=smallest;
                    smallest=arr[i];
                }
                else if(arr[i]>smallest && arr[i]<second ){
                    second=arr[i];
                }
                else{
                    second=smallest;
                }
            }
            System.out.println(second);
        }
        
          
    }
    
    public static void main(String[] args) {
        int arr[]={-1,-1,-1,-1};
        secsm(arr);
       
    }
}
