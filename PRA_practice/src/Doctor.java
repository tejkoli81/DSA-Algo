import java.util.*;

class Patient{
	int pid;
	String pname;
	String illness;
	public Patient(int pid,String pname,String illness){
		this.pid=pid;
		this.pname=pname;
		this.illness=illness;
	}
}
public class Doctor {
	int did;
	String dname;
	String spcl;
	List<Patient> patients=new ArrayList();
	
	public Doctor(int did,String dname,String spcl,List<Patient>patients){
		this.did=did;
		this.dname=dname;
		this.spcl=spcl;
		this.patients=patients;
	}

	public static void getUniqueillness(List<Doctor> dlist,int did){
		

		Set<String> illness=new HashSet();
		for(Doctor doc:dlist){
			if(did==doc.did){
				for(Patient p:doc.patients){
					illness.add(p.illness);
				}
			}
		}
		if(illness.isEmpty()){
			System.out.println("no diease found");
			return;
		}
		for(String i:illness){
			System.out.println(i);
		}
	}
	public static void getDoctorsbyscpl(List<Doctor> list,String scpl){
		List<String> found=new ArrayList();
		for(Doctor d:list){
			if(d.spcl.equalsIgnoreCase(scpl)){
				found.add(d.dname);
			}
		}
		if(found.isEmpty()){
			System.out.println("no doctor found");
			return;
		}
		for(String i:found){
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		List<Doctor> list=new ArrayList();
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int did=sc.nextInt();
			sc.nextLine();
			String dname=sc.nextLine();
			String scpl=sc.nextLine();
			int pn=sc.nextInt();
			List<Patient> plist=new ArrayList();
			for(int j=0;j<pn;j++){
				int pid=sc.nextInt();
				sc.nextLine();
				String pname=sc.nextLine();
				String illness=sc.nextLine();
				Patient p=new Patient(pid,pname,illness);
				plist.add(p);
			}
			Doctor d=new Doctor(did,dname,scpl,plist);
			list.add(d);
		}
		int docid=sc.nextInt();
		sc.nextLine();
		String spl=sc.nextLine();
		getUniqueillness(list, docid);
		getDoctorsbyscpl(list, spl);
	}

}
