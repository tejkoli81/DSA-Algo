
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;



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
 
     Map<Integer,Book> books;

    public Genre(int genreId, String genreName) {
        this.genreId = genreId;
        this.genreName = genreName;
        this.books=new TreeMap<>();
    }
    public void addbook(Book book){
        books.put(book.getBookId(), book);
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
    public static List<String> getBooksByAuthor(List<Genre> genreList, int genreId, String authorName) {
        for (Genre genre : genreList) {
            if (genre.genreId == genreId) {
                List<String> bookTitles = new ArrayList<>();
                for (Book book : genre.books.values()) {
                    
                    if (book.getAuthorName().contentEquals(authorName)) {
                        bookTitles.add(book.getTitle());

                    }
                }
                if (bookTitles.isEmpty()) {
                    System.out.println("No Books Found");
                    return new ArrayList<>();
                }
                Collections.sort(bookTitles); // Sort alphabetically
                return bookTitles;
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
