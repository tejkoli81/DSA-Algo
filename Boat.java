import java.util.*;

class Headset{
    private String headsetName;
    private String Brand;
    private int price;
    private Boolean available;
    public Headset(String headsetName, String Brand, int price, Boolean available) {
        this.headsetName = headsetName;
        this.Brand =Brand;
        this.price=price;
        this.available=available;
    }
    public void setheadsetname(String headset){
        this.headsetName=headset;
    }
    public String getheadsetname(){
        return headsetName;
    }
    public void setBrand(String brand){
        this.Brand=brand;
    }
    public String getbrand(){
        return Brand;
    }
    public void setprice(int Price){
        this.price=Price;
    }
    public int  getprice(){
        return price;
    }
    public void isavailable(Boolean Available){
        this.available=Available;
    }
    public Boolean getavailable(){
        return available;
    }
}

public class Boat {
    static int findTotalPriceforGivenBrand(Headset[] hs,String Brand){
        int sum=0;
        for(int i=0;i<hs.length; i++){
                if(hs[i].getbrand().equalsIgnoreCase(Brand)){
                    sum=sum+hs[i].getprice();
                }
        }
        return sum;
   
   }
   static Headset findsecondHeadsetMinPrice(Headset[] hs){
        Headset temp=null;
        int count =0;
        for(int i=0;i<hs.length;i++){
            if(hs[i].getavailable()){
                count++;
            }
        }

        int k=0;
        Headset newHeadset[] =new Headset[count];

        for(int i=0;i<newHeadset.length;i++){
            if(hs[i].getavailable()){
                newHeadset[k]=hs[i];
                k++;
            }
        }

        for(int i=0;i<newHeadset.length;i++){
            for(int j=i+1;j<newHeadset.length;j++){
                if(newHeadset[i].getprice()>newHeadset[j].getprice()){
                    temp=newHeadset[i];
                    newHeadset[i]=newHeadset[j];
                    newHeadset[j]=temp;
            }
        }
    }
        if(count>0){
            return newHeadset[1];
        }
        else{
            return null;
        }
    

   }
    public static void main(String[] args) {
        Headset hs[]=new Headset[4];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<hs.length;i++){
        String headName=sc.nextLine();
        String brand=sc.nextLine();
        int price=sc.nextInt();
        Boolean available=sc.nextBoolean();
        sc.nextLine();

            hs[i]=new Headset(headName,brand,price,available);

        }
        String newBrand=sc.nextLine();
        int sum=findTotalPriceforGivenBrand(hs, newBrand);
        if(sum>0){
            System.out.println("Total price for "+newBrand+" is "+sum);
        }
        else{
            System.out.println("zero");
        }
        Headset res=findsecondHeadsetMinPrice(hs);
        if(res!=null){
            System.out.println(res.getheadsetname());
            System.out.println(res.getprice());
        }
        else{
            System.out.println("not found");
        }

            

    }
}
/*
 * boAt BassHeads

boAt

1220

true

Over Ear Wired

boAt

549

true

In Ear with Mic

JBL

450

true

Buds 2 Neo

RealMe

500

true

boAt



boAt BassHeads
boAt
1220
false
Over Ear Wired
boAt
1549
false
In Ear with Mic
JBL
450
false
Buds 2 Neo
RealMe
500
false

boAt
 */