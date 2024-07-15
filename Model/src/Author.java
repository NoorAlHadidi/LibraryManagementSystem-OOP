import java.util.ArrayList;

public class Author extends Human {
    private ArrayList<Book> writtenBooks;
    public Author(String fName, String lName) {
        super(fName, lName);
        writtenBooks = new ArrayList<>();
    }
    public ArrayList<Book> getBooks() {
        return this.writtenBooks;
    }
    public boolean sameAuthor(Author author) {
        return (this.getFirstName()).equals(author.getFirstName()) && (this.getLastName()).equals(author.getLastName());
    }
}
