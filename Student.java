import java.util.*;
class Student {
    int id;
    String name;
    Map<String ,Integer> Subjects=new HashMap<>();
    
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    
    public void addsubject(String Subject,int grade){
        Subjects.put(Subject,grade);
    }
    
    public double getAverage(){
        int total=0;
        for(int avg:Subjects.values()){
            total+=avg;
        }
        return (double)total/Subjects.size();
    }
    public static List<String> studentswithAverageaboveThreshold(List<Student> student,int Threshold){
        ArrayList<String> al=new ArrayList<>();
        for(Student st:student){
            if(st.getAverage()>Threshold){
                al.add(st.name);
            }
        }
        return al;
    }
    public static List<String> studentswithmaxuniquegrades(List<Student> student){
    	ArrayList<String> al=new ArrayList<>();
    	int maxuniqe=0;
    	for(Student st:student){
    		Set<Integer> unique=new HashSet<>(st.Subjects.values());
    		int count=unique.size();
    		//System.out.println(count);
    		if(count>maxuniqe){
    			maxuniqe=count;
    			al.add(st.name);
    		}
    		else if(count == maxuniqe){
    		al.add(st.name);
    		}
    	}

    	return al;
    	
    }
    public static void main(String[] args) {
      ArrayList<Student> a=new ArrayList<>();
//       Student s1=new Student(101,"abc");
//       Student s2=new Student(102,"xyz");
//      Student s3=new Student(103,"dfg");
//       s1.addsubject("phy",78);
//       s1.addsubject("math",78);
//       s2.addsubject("Chem",80);
//       s2.addsubject("math",80);
//       s2.addsubject("phy",73);
//       s3.addsubject("phy", 67);
//       s3.addsubject("chem", 67);
//       s3.addsubject("math", 67);
//       s3.addsubject("PRA1", 67);
//       
//       a.add(s1);
//       a.add(s2);
//       
//       
    	Scanner sc=new Scanner(System.in);
    	
    	int n=sc.nextInt();
    	sc.nextLine();
    	for(int i=0;i<n;i++){

    		int id=sc.nextInt();
    		sc.nextLine();
    	
    		String name=sc.nextLine();
    		Student s=new Student(id,name);
    	
    		int suj=sc.nextInt();
    		sc.nextLine();
    		
    		for(int j=0;j<suj;j++){

    			String sujname=sc.nextLine();

    			int sujgrade=sc.nextInt();
    			sc.nextLine();
    			s.addsubject(sujname, sujgrade);
    		}
    		a.add(s);
    	}
    	int thres=sc.nextInt();
    	
    	List<String> st=studentswithAverageaboveThreshold(a,thres);
    	for(String name:st){
    		System.out.println(name);
    	}
    	List<String> su=studentswithmaxuniquegrades(a);
    	for(String name:su){
    		System.out.println(name);
    	}
    	
       
    }
}5
101
john
KV
85
102
emily
LPS
67
103
alex
DPS
92
104
sarah
VRS
58
105
david
LPS
74
LPS