public class swap {
    public static void swap(int x,int y){
        x=x-y;//5-10=-5
        y=x+y;//-5+10=5
        x=y-x;//5-(-5)=10
        System.out.println(x+" "+y);
    }
    public static void main(String[] args) {
        int a=5,b=10;

        swap(a,b);
    }
}
