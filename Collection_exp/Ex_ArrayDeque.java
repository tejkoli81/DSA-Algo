package collection_exp;
import java.util.*;
public class Ex_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer>aq=new ArrayDeque<>();
        aq.offer(1);
        aq.offer(2);
        aq.offer(3);
        aq.offer(4);
        aq.offer(5);
        aq.offer(6);
        aq.offer(7);
        aq.offer(8);
        System.out.println(aq.size());
        aq.offerFirst(0);
        System.out.println(aq);
        aq.offerLast(9);
        System.out.println(aq);
        System.out.println(aq.poll());
        System.out.println(aq.pollFirst());
        System.out.println(aq.pollLast());

        System.out.println(aq.pop());
        aq.push(10);
        aq.offer(11);
        System.out.println(aq);
        System.out.println(aq.peekLast());
        System.out.println(aq.peekFirst());




    }


}
