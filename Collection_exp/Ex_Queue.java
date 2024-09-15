package collection_exp;
import java.util.*;
public class Ex_Queue {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.offer(23);  //offer shows null if queue is empty whereas  add() shows Exception error
        q.offer(24);
        q.offer(25);
        q.offer(26);
        q.offer(27);
        q.offer(28);
        q.offer(29);
        q.offer(30);
        q.offer(31);

        System.out.println(q);

        System.out.println(q.poll()); // same remove() shows exception but poll() doesn't

       System.out.println(q.peek()); 

    

    }
}
