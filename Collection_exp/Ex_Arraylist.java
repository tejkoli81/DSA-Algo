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
        // Remove 
        list.remove(1);
        list.remove(Integer.valueOf(14));
        System.out.println(list);
        // addAll(Collection object)
        List<Integer> list2=new ArrayList<>();
        list2.addAll(list);
        list2.add(15);

        System.out.println(list);
        System.out.println(list2);

        //contains(value)
        System.out.println(list.contains(12));

        // containsAll(collection obj)
        System.out.println(list2.containsAll(list));





    }
}
