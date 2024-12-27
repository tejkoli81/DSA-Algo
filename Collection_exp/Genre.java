package collection_exp;




import java.util.*;

class Book{
 int bookId;
 String title;
 String authorName;
public int getBookId() {
    return bookId;
}

public String getTitle() {
    return title;
}

public Book(int bookId, String title, String authorName) {
    this.bookId = bookId;
    this.title = title;
    this.authorName = authorName;
}
public String getAuthorName() {
    return authorName;
}






}

public class Genre {
    int genreId;
     String genreName;
 
     Map<String,Book> books;

    public Genre(int genreId, String genreName) {
        this.genreId = genreId;
        this.genreName = genreName;
        this.books=new HashMap<>();
    }
    public void addbook(Book book){
        books.put(book.getTitle(), book);
    }
    //  public static List<String> getBooksByAuthor(List<Genre> genre,int greId,String author){
    //     for(Genre ge:genre){
    //         List<String> booksbygenre=new ArrayList<>();
    //         if(ge.genreId==greId){
    //             System.out.println(ge.genreId+" "+greId);
    //             for(Book book:ge.bookT.values()){
    //                 System.out.println(ge.bookT.values());
    //                 if(book.getAuthorName().equalsIgnoreCase(author)){

    //                     booksbygenre.add(book.getTitle());
    //                     System.out.println(book.getTitle());
    //                 }
    //             }
    //             if(booksbygenre.isEmpty()){
    //                 System.out.println("No book found");
    //                 return new ArrayList<>();
    //             }
    //             Collections.sort(booksbygenre);
    //             return booksbygenre;
    //         } 
    //     }
        
    //     System.out.println("Genre Not Found");
    //     return new ArrayList<>();

    // }
    public static List<String> getBooksByAuthor(List<Genre> genreList, int genreId, String Author) {
        for (Genre genre : genreList) {
            if (genre.genreId == genreId) {
                List<String> b = new ArrayList<>();
                for (Book books : genre.books.values()) {


                    if(books.getAuthorName().equals(Author)){
                        System.out.println("success");
                    }


                }
                if (b.isEmpty()) {
                    System.out.println("No Books Found");
                    return new ArrayList<>();
                }
                Collections.sort(b); // Sort alphabetically
                return b;
            }
        }
        System.out.println("Genre Not Found");
        return new ArrayList<>();
    }
    public static void main(String[] args) {
        List<Genre> lt=new ArrayList<>();
        Book b1=new Book(501,"The Great Gatsby","F. Scott Fitzgerald");
        Book b2=new Book(502,"1984","George Orwell");
        Book b3=new Book(503,"To Kill a Mockingbird","Harper Lee");
         Genre Fiction=new Genre(101,"Fiction");
         Fiction.addbook(b1);
         Fiction.addbook(b2);
         Fiction.addbook(b3);
         lt.add(Fiction);
        Genre NonFiction=new Genre(102,"Non-Fiction");
        Book b4=new Book(504,"TSapiens", "Yuval Noah Harari");
        Book b5=new Book(505,"Educated","Tara Westover");
        NonFiction.addbook(b4);
        NonFiction.addbook(b5);

       List<String>bookauthor=Genre.getBooksByAuthor(lt,101 ,"F. Scott Fitzgerald ");
       for(String title:bookauthor){
        System.out.println(title);
       }


       
        
    }
}
// import java.util.*;
// class Book{
// 	private int BookId;
// 	private String title ;
// 	private String authorName ;
// 	public Book(int bookId, String title, String authorName) {
// 		super();
// 		BookId = bookId;
// 		this.title = title;
// 		this.authorName = authorName;
// 	}
// 	public int getBookId() {
// 		return BookId;
// 	}
// 	public void setBookId(int bookId) {
// 		BookId = bookId;
// 	}
// 	public String getTitle() {
// 		return title;
// 	}
// 	public void setTitle(String title) {
// 		this.title = title;
// 	}
// 	public String getAuthorName() {
// 		return authorName;
// 	}
// 	public void setAuthorName(String authorName) {
// 		this.authorName = authorName;
// 	}
	
	
	
// }
// public class Genre {
	
// 	 int genreId;
// 	 String genreName;
// 	 TreeMap<Integer,Book> books=new TreeMap<>();
	
// 	public Genre(int genreId, String genreName) {
// 		super();
// 		this.genreId = genreId;
// 		this.genreName = genreName;
// 		this.books = books;
// 	}
// 	public void addBook(Book book){
// 		books.put(book.getBookId(),book);
// 	}
// 	public static List<String> getBooksByAuthor(List<Genre> gr,int genreId,String Author){
// 		List<String> found=new ArrayList<>();
// 		for(Genre ge:gr){
// 			if(ge.genreId==genreId){
// 				for(Book book:ge.books.values()){

					
// 					if(book.getAuthorName().equalsIgnoreCase(Author)){
					
// 						found.add(book.getTitle());
// 					}
// 				}
// 				if(found.isEmpty()){
// 					System.out.println("No Book Found ");
// 					return new ArrayList();
// 				}
// 			}
// 			else {System.out.println("No Genre Found");
// 			}
// 			Collections.sort(found);
// 			return found;
// 		}
// 		return new ArrayList();
		
// 	}
// 	public static List<String> getGenresById(List<Genre> genres,int BookId){
// 		List<String> foundgr=new ArrayList<>();
// 		for(Genre gr:genres){
// 			for(Book b:gr.books.values()){
				
// 				//System.out.println(gr.books.values());
				
// 				if(b.getBookId()==BookId){

// 					foundgr.add(gr.genreName);
	
// 				}
// 				if(foundgr.isEmpty()){
// 					System.out.println("No Genres Foound");
// 					return new ArrayList();
// 				}
// 			}
// 			return foundgr;
// 		}
// 		return new ArrayList();
// 	}
	
// 	public static void main(String[] args) {
// 		// TODO Auto-generated method stub
// 		Book b1=new Book(501,"The Great Gatsby","F. Scott Fitzgerald");
// 		Book b6=new Book(506,"Gatsby","F. Scott Fitzgerald");
// 		Book b2=new Book(502,"1984","George Orwell");
// 		Book b3=new Book(503,"To Kill a MockingBird","Harper Lee");
// 		Book b4=new Book(504,"Sapiens","Yuval Noah Harari");
// 		Book b5=new Book(505,"Educated","Tara Westover");
		
// 		Genre Fiction=new Genre(101,"Fiction");
// 		Genre NonFiction=new Genre(102,"Non-Fiction");
// 		Fiction.addBook(b1);
// 		Fiction.addBook(b2);
// 		Fiction.addBook(b3);
// 		Fiction.addBook(b6);
		
// 		NonFiction.addBook(b4);
// 		NonFiction.addBook(b5);
		
// 		List<Genre> lt=new ArrayList<>();
// 		lt.add(Fiction);
// 		lt.add(NonFiction);
		
// 		List<String> author=Genre.getBooksByAuthor(lt, 101, "F. Scott Fitzgerald");
// 		for(String l:author){
// 			System.out.println(l);
// 		}
		
// 		List<String> geners=Genre.getGenresById(lt, 501);
// 		for(String l:geners){
// 			System.out.println(l);
// 		}
		
		
// 	}

// }
