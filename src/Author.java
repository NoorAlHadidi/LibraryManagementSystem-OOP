import java.util.ArrayList;

public class Author extends Human {
    private ArrayList<Book> writtenBooks = new ArrayList<>();
    public Author(String fName, String lName) {
        super(fName, lName);
    }
    public ArrayList<Book> getBooks() {
        return this.writtenBooks;
    }
    public void writeBook(Book newBook) {
        writtenBooks.add(newBook);
    }
    public void removeBook(Book book) {
        writtenBooks.remove(book);
    }
}
