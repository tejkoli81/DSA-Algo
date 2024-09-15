package Collection_exp;
import java.util.*;

public class Ex_Arraylist {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        System.out.println(list);
        
        //ADD FORM INDEX
        list.add(1,30);
        System.out.println(list);

    }
}
