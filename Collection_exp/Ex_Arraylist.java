package collection_exp;
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

        //removeAll(collection obj)

        // list2.removeAll(list);
        // System.out.println(list);
        // System.out.println(list2);

        //get(int idx)
        System.out.println(list2.get(0));

        //set(int idx,element)
        list2.set(0, 20);
        System.out.println(list2);

        //indexOf(value)-> index of value in list
       System.out.println( list2.indexOf(13));


       //Iterator 
       List<String> list3=new ArrayList();
       list3.add("Rahul");
       list3.add("Vivek");
       list3.add("Abhay");
       list3.add("Pranav");
       list3.add("Abhijeet");

            //basic method 
            for(int i=0;i<list3.size();i++){
                System.out.println("Name:"+list3.get(i));
            }

            //For each loop
            for(String name:list3){
                System.out.println("name: "+name);
            }

            // Iterator 
            Iterator<String> ne=list3.iterator();
            while(ne.hasNext()){
                System.out.println(ne.next());
            }
        //ListIterator
        Iterator<String> ie=list3.listIterator();
            while(ie.hasNext()){
                System.out.println(ie.next());
            }
        
        //subList(start idx,end idx)

        System.out.println(list3.subList(2,5));

    }
}
