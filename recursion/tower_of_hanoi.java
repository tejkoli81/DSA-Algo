package recursion;

public class tower_of_hanoi {
    public static void towerofhanoi(int d,String src,String helper,String dest){
        if(d==1){
            System.out.println("disk "+d+" transfer from "+src+ " to "+dest);
            return;
        }
        towerofhanoi(d-1, src,dest,helper);
        System.out.println("disk "+d+" transfer from "+src+ " to "+dest);
        towerofhanoi(d-1,helper, src,dest);
    }
    public static void main(String[] args) {
        int disk=3;

        towerofhanoi(disk,"source","helper","designation");
    }
}
