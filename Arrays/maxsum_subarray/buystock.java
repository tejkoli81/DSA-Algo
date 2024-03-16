package Arrays.maxsum_subarray;


public class buystock {

    public static void buysellstock1(int price[]){
        int maxprofit=0;
        int buyprice=Integer.MAX_VALUE;
        int sell=buyprice;
        for(int i=0;i<price.length;i++){
            if(buyprice<price[i]){
                int profit=price[i]-buyprice;
                maxprofit=Math.max(maxprofit, profit);
            }
            else{
                buyprice=price[i];
            }
        }
        int totalprofit=sell-maxprofit;
        System.out.println(maxprofit);
    }
    public static void buysellstock2(int price[]){
        int maxprofit=0;
        for(int i=1;i<price.length;i++){
            if(price[i]>price[i-1]){
                maxprofit+=price[i]-price[i-1];
            }
        }
        
        System.out.println(maxprofit);
    }
    public static void main(String[] args) {
        int arr[]={7, 6, 4, 3, 1};

        buysellstock1(arr);
    }
}
