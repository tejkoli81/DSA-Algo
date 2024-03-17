package OOPS;

public class Classes_objects {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColour("Red");
        p1.setsize(2);
        
        Student s1=new Student();
        s1.setname("omkar");
        s1.setage(20);
        s1.calcprecent(8,7,9);
        
        System.out.println("pen color is" +p1.colour);
        System.out.println("pen tip size is" +p1.tipsize);
        System.out.println("Student name is" +s1.name);
        System.out.println("Student age is" +s1.age);
        System.out.println("Student percentage is" +s1.percentage);
    }
}

class Pen{
    String colour;
    int tipsize;
    void setColour(String newcolor){
        colour=newcolor;
    }
    void setsize(int newsize){
        tipsize=newsize;
    }
}

class Student{
    String name;
    int age;
    float percentage;//cgpa
    void setname(String newname){
        name=newname;
    }
    void setage(int newage){
        age=newage;
    }
    void calcprecent(int java,int dsa,int ait){
        percentage=(java+dsa+ait)/3.0f;
    }
}
