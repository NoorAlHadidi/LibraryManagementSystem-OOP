import java.util.ArrayList;

public class Customer extends Human {
    private ArrayList<Book> reservedBooks = new ArrayList<>();
    public Customer(String fName, String lName, int num) {
        super(fName, lName, num);
    }
    @Override
    public ArrayList<Book> getBooks() {
        return this.reservedBooks;
    }
    public void borrowBook(Book book) {
        reservedBooks.add(book);
    }
    public void returnBook(Book book) {
        reservedBooks.remove(book);
    }
}
