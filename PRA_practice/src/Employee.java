import java.util.*;
class Project{
	String  pname;
	int rating;
	public Project(String pname,int rating){
		this.pname=pname;
		this.rating=rating;
	}
	
}
public class Employee {
	int empid;
	String ename;
	String cname;
	int prono;
	List<Project> projects=new ArrayList();
	public Employee(int empid,String ename,String cname,List<Project> projects){
		this.empid=empid;
		this.ename=ename;
		this.cname=cname;
		this.prono=prono;
		this.projects=projects;
	}
	public static void uniquerating(List<Employee> list,int eid){
		Set<Integer> uni =new HashSet();
		for(Employee e:list){
			if(e.empid==eid){
				for(Project p:e.projects){
					uni.add(p.rating);
				}
			}
		}
		if(uni.isEmpty()){
			System.out.println("no Rating found");
			return;
		}
		for(int i:uni){
			System.out.println(i);
		}
	}
	public static void GetAverage(List<Employee> list,int ths){
		List<String> find=new ArrayList();
		for(Employee e:list){
			int total=0;
			int count=0;
			
			for(Project p:e.projects){
				total+=p.rating;
				count++;
			}
			double avg=(double)total/count;
			if(avg>ths){
				find.add(e.ename);
			}
		}
		if(find.isEmpty()){
			System.out.println("No employee found");
			return;
		}
		for(String d:find){
			System.out.println(d);
		}
	}
	 public static void main(String[] args) {
		 List<Employee> list=new ArrayList();
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++){
			int eid=Integer.parseInt(sc.nextLine());
			String ename=sc.nextLine();
			String cname=sc.nextLine();
			int pno=Integer.parseInt(sc.nextLine());
			List<Project> plist=new ArrayList();
			for(int j=0;j<pno;j++){
				String pname=sc.nextLine();
				int rating=Integer.parseInt(sc.nextLine());
				Project p=new Project(pname, rating);
				plist.add(p);
			}
			Employee e=new Employee(eid, ename, cname, plist);
			list.add(e);
		}
		
		
		int threhold=Integer.parseInt(sc.nextLine());
		int tid=Integer.parseInt(sc.nextLine());
		GetAverage(list, threhold);
		uniquerating(list, tid);
	
	}
	
}
