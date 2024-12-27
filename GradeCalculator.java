import java.lang.*;
import java.util.*;

class Student{
    private int studentId;
    private int studentGrade;
    private String schoolname;
    private String studentname;
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public int getStudentGrade() {
        return studentGrade;
    }
    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }
    public String getSchoolname() {
        return schoolname;
    }
    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }
    public String getStudentname() {
        return studentname;
    }
    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
    public String toString() {
        return "Student [studentId=" + studentId + ", studentGrade=" + studentGrade + ", schoolname=" + schoolname
                + ", studentname=" + studentname + "]";
    }
    public Student(int studentId,int studentGrade,String schoolname,String studentname ){
        this.studentId=studentId;
        this.studentGrade=studentGrade;
        this.studentname=studentname;
        this.schoolname=schoolname;
    }
    
}  
public class GradeCalculator{
   static List<Student> students=new ArrayList<>();
    public static double calculateAverage(String Schoolname){
        int total=0;
        int cunt=0;
        double average=0;
        for(Student st:students){
            if(st.getSchoolname().equalsIgnoreCase(Schoolname)){
                total+=st.getStudentGrade();
                cunt++;
            }
        }
            average=total/cunt;
            return average;
    }
    // public static int countPassingStudents(String schoolname){
        
    // }
    public static void main(String args[]){
        int sid,sgrade;
        String sname,scname;
        Scanner sc=new Scanner(System.in);
        System.out.println("No of student");
        int sno=sc.nextInt();
        for(int i=0;i<sno;i++){
            System.out.println("Student id:");
             sid=sc.nextInt();
            sc.nextLine();
            System.out.println("Student name");
             sname=sc.nextLine();
            System.out.println("School Name");
             scname=sc.nextLine();
            System.out.println("Student Grade");
             sgrade=sc.nextInt();
            Student s=new Student(sid, sgrade, scname, sname);
            students.add(s);
        System.out.println(s);
        System.out.println(calculateAverage(scname));
        }
    }
}


