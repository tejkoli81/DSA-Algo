package Collection_exp;


// import java.util.*;
// import java.lang.*;
public class Wrapper_class {
    public static void main(String[] args) {
        Integer obj=new Integer(12);
        System.out.println(obj);

        Integer obj2=Integer.valueOf(12);
        Integer obj4=Integer.valueOf("12"); // this method auto convert the string into int
        System.out.println(obj2);

        Integer obj3=12;// AutoBoxing from int to Integer object
        System.out.println(obj3);

        int i=obj3;//  UnBoxing form Integer to int 
        System.out.println(i);
    }
}
