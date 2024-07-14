import java.util.ArrayList;

public class Author extends Human {
    private ArrayList<Book> writtenBooks = new ArrayList<>();
    public Author(String fName, String lName, int num) {
        super(fName, lName, num);
    }
    @Override
    public ArrayList<Book> getBooks() {
        return this.writtenBooks;
    }
    public void writeBook(Book newBook) {
        writtenBooks.add(newBook);
    }
}
