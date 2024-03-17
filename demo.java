public class demo {
    public static boolean containsDuplicate(int[] arr) {
       boolean ispresent=false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length;j++) {
                if(arr[i]==arr[j]){
                    ispresent=true;
                    break;
                }
            }
        }
      return ispresent;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3};
        System.out.println(containsDuplicate(arr)); 
    }
}

