import java.util.*;
import java.lang.*;
class Contact1{
	int cid;
	String cname;
	String ctype;
	int noofph;
	Set<Integer> phons=new HashSet();
	
	public Contact1(int cid,String cname,String ctype,int noofph,Set<Integer> phons){
		this.cid=cid;
		this.cname=cname;
		this.ctype=ctype;
		this.noofph=noofph;
		this.phons=phons;
	}
	public void dis(){
		for(int i:phons){
			System.out.println(i);
		}
	}
	public void displayContact() {
        System.out.println(cid);
        System.out.println(cname);
        System.out.println(ctype);
        for (int number : phons) {
            System.out.println(number);
        }
    }
}
public class Phonebook1 {
	
	String caname;
	int cnum;
	List<Contact1> contacts=new ArrayList();
	public Phonebook1(String caname, int cnum) {
		// TODO Auto-generated constructor stub
		this.caname=caname;
		this.cnum=cnum;
		this.contacts=contacts;
	}
	
	public  void addcontact(Contact1 c){
		if(contacts.size()<cnum){
			contacts.add(c);
		}
	}
	public  void getcontbyname(List<Phonebook1>phones,String name){
		boolean found =false;
		for(Phonebook1 p:phones){
		for(Contact1 c:p.contacts){
			if(c.cname.equalsIgnoreCase(name)){
				c.displayContact();
				found=true;
			}
		}
		}
		if(!found){
			System.out.println("No found");
			return;
		}
		
	}
	public  void contintcat(List<Phonebook1>phones,String catname){
		Set<String> name=new TreeSet();
		for(Phonebook1 p:phones){
			if(p.caname.equalsIgnoreCase(catname)){
				for(Contact1 c:p.contacts){
					name.add(c.cname);
				}
			}
		}
		if(name.isEmpty()){
			System.out.println("no funad");
		}
		else{
			System.out.println(String.join(", ", name));
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Contact1> contacts=new ArrayList();
		
	Scanner sc=new Scanner(System.in);
	int n=Integer.parseInt(sc.nextLine());
	for(int i=0;i<n;i++){
		int cid=Integer.parseInt(sc.nextLine());
		String cname=sc.nextLine();
		String ctype=sc.nextLine();
		int no=Integer.parseInt(sc.nextLine());
		Set<Integer> phs=new HashSet();
		for(int j=0;j<no;j++){
			phs.add(Integer.parseInt(sc.nextLine()));
		}
		Contact1 c=new 	Contact1(cid, cname, ctype, no, phs);
		contacts.add(c);
	}
	Phonebook1 ph=null;
	List<Phonebook1>phones=new ArrayList();
	int nog=Integer.parseInt(sc.nextLine());
	for(int i=0;i<nog;i++){
		String catname=sc.nextLine();
		int noc=Integer.parseInt(sc.nextLine());
		ph=new Phonebook1(catname,noc);
		for(int j=0;j<noc;j++){
			int cid=Integer.parseInt(sc.nextLine());
			for(Contact1 c:contacts){
				if(c.cid==cid){
					ph.addcontact(c);
				}
			}
		}
		phones.add(ph);
	}
		String tname=sc.nextLine();
		String gtkae=sc.nextLine();
		ph.getcontbyname(phones,tname);
		ph.contintcat(phones,gtkae);
		

	}

}

//3
//101
//Alice
//Work
//1
//1234566789
//102
//Bob
//Work
//1
//123445677
//103
//Alice
//Home
//3
//1234567890
//0987654321
//0987654321
//2
//Friends
//2
//101
//102
//Other
//1
//103
//Alice
//Friends