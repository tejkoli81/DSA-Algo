import java.util.*;

// Book Class
class Book {
    int bookId;
    String title;
    String authorName;

    // Constructor
    public Book(int bookId, String title, String authorName) {
        this.bookId = bookId;
        this.title = title;
        this.authorName = authorName;
    }

    // Getter methods
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }
}

// Genre Class
class Genre {
    int genreId;
    String genreName;
    Map<Integer, Book> books;

    // Constructor
    public Genre(int genreId, String genreName) {
        this.genreId = genreId;
        this.genreName = genreName;
        this.books = new HashMap<>();
    }

    // Method to add a book to the genre
    public void addBook(Book book) {
        books.put(book.getBookId(), book);
    }

    // Method to get books by a specific author in a genre
    public static List<String> getBooksByAuthor(List<Genre> genreList, int genreId, String authorName) {
        for (Genre genre : genreList) {
            if (genre.genreId == genreId) {
                List<String> bookTitles = new ArrayList<>();
                for (Book book : genre.books.values()) {
                    if (book.getAuthorName().equals(authorName)) {
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

    // Method to get genres by a specific book ID
    public static List<String> getGenresByBookId(List<Genre> genreList, int bookId) {
        List<String> genreNames = new ArrayList<>();
        for (Genre genre : genreList) {
            if (genre.books.containsKey(bookId)) {
                genreNames.add(genre.genreName);
            }
        }
        if (genreNames.isEmpty()) {
            System.out.println("No Genres Found");
            return new ArrayList<>();
        }
        return genreNames;
    }
}

// Main class to demonstrate functionality
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Sample input
        Genre fiction = new Genre(101, "Fiction");
        fiction.addBook(new Book(501, "The Great Gatsby", "F. Scott Fitzgerald"));
        fiction.addBook(new Book(502, "1984", "George Orwell"));
        fiction.addBook(new Book(503, "To Kill a Mockingbird", "Harper Lee"));

        Genre nonFiction = new Genre(102, "Non-Fiction");
        nonFiction.addBook(new Book(504, "Sapiens", "Yuval Noah Harari"));
        nonFiction.addBook(new Book(505, "Educated", "Tara Westover"));

        List<Genre> genreList = new ArrayList<>();
        genreList.add(fiction);
        genreList.add(nonFiction);

        // Example 1: Get books by author in a genre
        List<String> booksByAuthor = Genre.getBooksByAuthor(genreList, 101, "F. Scott Fitzgerald");
        for (String title : booksByAuthor) {
            System.out.println(title);
        }

        // Example 2: Get genres by book ID
        List<String> genresByBookId = Genre.getGenresByBookId(genreList, 502);
        for (String genreName : genresByBookId) {
            System.out.println(genreName);
        }
    }
}
