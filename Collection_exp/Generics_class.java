package collection_exp;

class Dog<E>{
    private E id;
 
    public Dog(E id) {
        this.id = id;   
        }

    public E getid(){
        return id;
    }
}
public class Generics_class {
    public static void main(String[] args) {
        Dog<String> d1=new Dog("12");
        Dog<String> d2=new Dog("11");
        Dog<Integer> d3=new Dog(13);

        System.out.println(d1.getid());
        System.out.println(d2.getid());
        System.out.println(d3.getid());
    }
}
