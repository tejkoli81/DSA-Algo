package OOPS;

public class Deep_shallow_copy {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Omkar";
        s1.rollNo=123;
        s1.branch="CS";

        Student s2=s1; //copy constructor is called here
        s2.branch="IT";
    }
}
class Student{
    String name;
    int rollNo;
    String branch;

    // Student(Student s1){  //Shallow Copy
    //     this.name =s1.name; //copy constructor
    //     this.rollNo=s1.rollNo;
    // }
    Student(Student s1){  //deep Copy
        this.name =s1.name; //copy constructor
        this.rollNo=s1.rollNo;
        this.branch=s1.branch;
    }
    Student(){
    }

    Student(String name){
        this.name = name;
    }
     
}
