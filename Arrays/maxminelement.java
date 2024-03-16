package Arrays;

public class maxminelement {
    public static void maxmin(int num[]){
        int maxn=Integer.MIN_VALUE;
        int minn=Integer.MAX_VALUE;

        for(int i=0;i<num.length;i++){
            if(num[i]>maxn){
                maxn=num[i];
            }
            if(num[i]<minn){
                minn=num[i];
            }
        }
        int diff=maxn- minn;
        System.out.println("max:"+maxn);
        System.out.println("min:"+minn);
        System.out.println("difference:"+diff);
    }
    public static void main(String[] args) {
        
        int arr[]={2,5,3,8,1};
    
        maxmin(arr);
    }
}
