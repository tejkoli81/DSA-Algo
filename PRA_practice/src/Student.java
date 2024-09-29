import java.util.*;
import java.util.Map.Entry;
public class Student {
int sid;
String sname;
Map<String,Integer> marks=new HashMap();

	public Student(int sid, String sname, Map<String, Integer> marks) {
	this.sid = sid;
	this.sname = sname;
	this.marks = marks;
}
	public double getavg(){
		int total=0;
		int count=0;
		for(Entry<String, Integer> s:marks.entrySet()){
			total+=s.getValue();
			count++;
		}
		return (double)total/count;
	}
public static void studwithavgthes(List<Student> list,int th){
	List<String> fnd=new ArrayList();
	
	for(Student s:list){
		if(s.getavg()>th){
			fnd.add(s.sname);
		}
	}
	if(fnd.isEmpty()){
		System.out.println("no found");
		return;
	}
	for(String s:fnd){
		System.out.print(s+" ");
	}
}

public static void uniquegrage(List<Student> list){
	List<String> found=new ArrayList();
	int maxuniqe=0;
	for(Student s:list){
		Set<String> fnd=new HashSet(s.marks.values());
		int uniqcunt=fnd.size();
		if(uniqcunt>maxuniqe){
			maxuniqe=uniqcunt;
		}
	}
	for(Student s:list){
		Set<String> fnd=new HashSet(s.marks.values());
		if(fnd.size()==maxuniqe){
			found.add(s.sname);
		}
	}
	
	if(found.isEmpty()){
		System.out.println("no found");
		return;
	}
	for(String s:found){
		System.out.print(s+" ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++){
			int sid=Integer.parseInt(sc.nextLine());
			String sname=sc.nextLine();
			int nos=Integer.parseInt(sc.nextLine());
			Map<String ,Integer> mp=new HashMap();
			for(int j=0;j<nos;j++){
				String suj=sc.nextLine();
				int grade=Integer.parseInt(sc.nextLine());
				mp.put(suj, grade);
				
			}
			Student s=new Student(sid, sname, mp);
			list.add(s);
		}
		int th=Integer.parseInt(sc.nextLine());
		studwithavgthes(list, th);
		System.out.println();
		uniquegrage(list);
		
	}

}
