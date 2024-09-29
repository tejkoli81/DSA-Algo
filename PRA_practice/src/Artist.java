import java.util.*;
class Album{
	int alid;
	String atitle;
	int yrs;
	public Album(int alid,String atitle,int yrs){
		this.alid=alid;
		this.atitle=atitle;
		this.yrs=yrs;
	}
}
public class Artist {
	int aid;
	String aname;
	String genre;
	List<Album> albs=new ArrayList();
	public Artist(int aid,String aname,String genre,List<Album> albs){
		this.aid=aid;
		this.albs=albs;
		this.aname=aname;
		this.genre=genre;
	}
	
	public static void getablyyyrs(List<Artist> list,int arid,int srt,int end){
		List<String> found=new ArrayList();
		boolean flag=false;
		for(Artist a:list){
			if(a.aid==arid){
				flag=true;
				for(Album al:a.albs){
					if(al.yrs>=srt && al.yrs<=end){
						
						found.add(al.atitle);
					}
				}
			}
		}
		if(found.isEmpty()){
			System.out.println("No ablums found");
			return;
		}
		if(flag==false){
			System.out.println("No artist found");
		}
		for(String g:found){
			System.out.println(g);
		}
	}
	public static void getmostablums(List<Artist> list){
		Map<String,Integer> mapcount=new HashMap();
		for(Artist a:list){
			mapcount.put(a.genre,mapcount.getOrDefault(a.genre, 0)+a.albs.size());
			
		}
		if(mapcount.isEmpty()){
			System.out.println("no albums found");
			return;
		}
		int max=0;
		String maxg=null;
		for(Map.Entry<String, Integer> entr:mapcount.entrySet()){
			if(entr.getValue()>max){
				max=entr.getValue();
				maxg=entr.getKey();
			}
		}
		System.out.println(maxg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Artist> list=new ArrayList();
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++){
			int aid=Integer.parseInt(sc.nextLine());
			String aname=sc.nextLine();
			String ge=sc.nextLine();
			int noa=Integer.parseInt(sc.nextLine());
			List<Album> art=new ArrayList();
			for(int j=0;j<noa;j++){
				int alid=Integer.parseInt(sc.nextLine());
				String title=sc.nextLine();
				int yrs=Integer.parseInt(sc.nextLine());
				Album a=new Album(alid, title, yrs);
				art.add(a);
			}
			Artist at=new Artist(aid, aname, ge, art);
			list.add(at);
		}
		
		int artid=Integer.parseInt(sc.nextLine());
		int srt=Integer.parseInt(sc.nextLine());
		int end=Integer.parseInt(sc.nextLine());
		
		getablyyyrs(list, artid, srt, end);
		getmostablums(list);
	}

}
