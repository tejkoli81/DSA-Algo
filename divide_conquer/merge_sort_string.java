package divide_conquer;

public class merge_sort_string {

    public static String[] mergesort(String[] arr, int l, int h){
        if(l == h){
            String ar[]={arr[l]};
            return ar;
        }
        int mid=l+(h-l)/2;
        String[] left = mergesort(arr,l,mid);
        String[] right = mergesort(arr,mid+1,h);
        String[] ar3=merge(left,right);
        return ar3;
    }
    public static String[] merge(String[] a, String[] b) {
        int n=a.length,m=b.length;
        int index =0;
        String arr[]=new String[m+n];
        int i=0,j=0;
        while(i<n && j<m){
        if(isAlpha(a[i],b[j])){
                arr[index]=a[i];
                i++;
            }
        else{
            arr[index]=b[j];
                j++;
        }
        index++;
        }
        while(i<n){
             arr[index++]=a[i++];   
        }
        while(j<m){
             arr[index++]=b[j++];   
        }
        return arr;

    }
    public static Boolean isAlpha(String  x , String y ){
            x=x.toUpperCase();
            y=y.toUpperCase();
            if(x.compareTo(y)<0){
                return true;
            }
            return false;
    }
    public static void main(String[] args) {
        String str[]={"sun", "earth", "mars", "mercury"};
        
        String st[] =mergesort(str,0,str.length-1);

        for(int i=0;i<st.length;i++){
            System.out.print('"'+st[i]+'"'+",");
        }
    }
}
