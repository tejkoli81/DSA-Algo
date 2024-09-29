//import java.util.*;
//class Contact{
//	int cid;
//	String cname;
//	String pnno;
//	String email;
//	public Contact(int cid,String cname,String pnno,String email){
//		this.cid=cid;
//		this.cname=cname;
//		this.pnno=pnno;
//		this.email=email;
//	}
//	@Override
//	public String toString() {
//		return "Contact [cid=" + cid + ", cname=" + cname + ", pnno=" + pnno
//				+ ", email=" + email + "]";
//	}
//	
//}
//public class Phonebook {
//	static List<Contact> contacts=new ArrayList();
//	public Phonebook(List<Contact> contacts){
//		this.contacts=contacts;
//	}
//public void addContact(Contact c){
//	contacts.add(c);
//	
//}
//public static void Seachbyname(String name){
//	boolean flag=false;
//	for(Contact c:contacts){
//		if(c.cname.equalsIgnoreCase(name)){
//			System.out.println(c);
//			flag=true;
//		}	
//	}
//	if(flag==false){
//		System.out.println("No found");
//	}
//}
//public static void deletecontact(String pnno){
//	Contact d=null;
//	boolean flag=false;
//	for(Contact c:contacts){
//		if(c.pnno.equalsIgnoreCase(pnno)){
//			d=c;
//			flag=true;
//			break;
//		}
//	}
//	if(flag==true){
//		contacts.remove(d);
//		System.out.println("detele");
//	}
//	else System.out.println("no delete");
//}
////public static void sortbyname(){
////
////}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		for(int i=0;i<n;i++){
//			int id=sc.nextInt();
//			sc.nextLine();
//			String name=sc.nextLine();
//			String  phno=sc.nextLine();
//			String email=sc.nextLine();
//			Contact c=new Contact(id,name,phno,email);
//			Phonebook.contacts.add(c);
//		}
//		String name=sc.nextLine();
//		String phone=sc.nextLine();
//		deletecontact(phone);
//		Seachbyname(name);
////		sortbyname();
//	}
//
//}
