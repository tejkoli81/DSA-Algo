//import java.util.*;
//class Invalid extends Exception{
//	public Invalid(String m){
//		super();
//		System.out.println(m);
//	}
//}
//class nostudent extends Exception{
//	public nostudent(String m){
//		super();
//		System.out.println(m);
//	}
//}
//class Student{
//	int sid;
//	String sname;
//	String scname;
//	int grade;
//	public Student(int sid,String sname,String scname,int grade){
//		this.sid=sid;
//		this.sname=sname;
//		this.grade=grade;
//		this.scname=scname;
//	}
//}
//
//public class GradeCalcutor {
//
//	 static List<Student>students=new ArrayList();
//	public GradeCalcutor(List<Student>students){
//		this.students=students;
//	}
//	public static void calculateAvg(String name) throws Invalid,nostudent{
//		int total=0;
//		int count=0;
//		for(Student s:students){
//			if(s.grade<0){
//				throw new Invalid("Invalid Grades");
//			}
//			else if(s.scname.equalsIgnoreCase(name)){
//				total+=s.grade;
//				count++;
//			}
//		}
//		double result=(double)total/count;
//		if (count==0){
//			throw new nostudent("No Stundent present");
//		}else{
//			
//			System.out.println("AVERAGE GRADE FOR "+name+" "+result);
//		}
//		
//	}
//	public static void countPassing(String name){
//		int count=0;
//		boolean flag=false;
//		for(Student s:students){
//			if(s.scname.equalsIgnoreCase(name)){
//				if(s.grade>=60){
//					count++;
//					flag=true;
//				}
//			}
//		}
//		if(flag==false){
//			System.out.println("No school found");
//		}
//		else{
//			System.out.println("Passing studnts in "+name+" "+count);
//		}
//	}
//	public static void main(String[] args)  {
//
//		List<Student> list=new ArrayList();
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		for(int i=0;i<n;i++){
//			int sid=sc.nextInt();sc.nextLine();
//			String sname=sc.nextLine();
//			String scname=sc.nextLine();
//			int grade=sc.nextInt();
//			sc.nextLine();
//			Student s=new Student(sid,sname,scname,grade);
//			list.add(s);
//		}
//		GradeCalcutor g=new GradeCalcutor(list);
//		String school=sc.nextLine();
//		try {
//			g.calculateAvg(school);
//		} catch (Invalid e) {
//			// TODO Auto-generated catch block
//			e.getMessage();
//		} catch (nostudent e) {
//			// TODO Auto-generated catch block
//			e.getMessage();
//		}
//		g.countPassing(school);
//	}
//
//}
////5
////101
////j
////kv
////85
////102
////e
////lps
////67
////103
////a
////dps
////92
////104
////sarah
////vrs
////58
////105
////d
////lps
////74
////lps
