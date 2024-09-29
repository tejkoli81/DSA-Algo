import java.util.*;
class Book1{
	int bid;
	String title;
	String authname;
	public Book1(int bid,String title,String authname){
		this.bid=bid;
		this.authname=authname;
		this.title=title;
	}
}
public class Genre {
	int gid;
	String gname;
	Map<Integer,Book1> books=new HashMap();
	public Genre(int gid,String gname,Map<Integer,Book1> books){
		this.gid=gid;
		this.gname=gname;
		this.books=books;
		
	}
	public static void getbookbyauth(List<Genre> list,String auth){
		Set<String> found=new TreeSet();
		for(Genre g:list){
			for(Book1 b:g.books.values()){
				if(b.authname.equalsIgnoreCase(auth)){
					found.add(b.title);
				}
				
			}
		}
		if(found.isEmpty()){
			System.out.println("No book found");
			return;
		}
		for(String g:found){
			System.out.println(g);
		}
	}
	public static void getgenresbybookid(List<Genre> list,int bkid){
		List<String> found=new ArrayList();
		for(Genre g:list){
			for(Book1 b:g.books.values()){
				if(b.bid==bkid){
	
					found.add(g.gname);
					
				}
			}
		}
		if(found.isEmpty()){
			System.out.println("No genre found");
			return;
		}
		for(String g:found){
			System.out.println(g);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Genre> lists=new ArrayList();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int gid=sc.nextInt();
			sc.nextLine();
			String gname=sc.nextLine();
			int bno=sc.nextInt();
			Map<Integer,Book1> bks=new HashMap();
			for(int j=0;j<bno;j++){
				int bkid=sc.nextInt();
				sc.nextLine();
				String title=sc.nextLine();
				String authname=sc.nextLine();
				Book1 b=new Book1(bkid,title,authname);
				bks.put(bkid, b);
			}
			Genre g=new Genre(gid,gname,bks);
			lists.add(g);
		}
		
		int bkid=sc.nextInt();sc.nextLine();
		String auth=sc.nextLine();
		getbookbyauth(lists, auth);
		getgenresbybookid(lists, bkid);
		
	}

}
