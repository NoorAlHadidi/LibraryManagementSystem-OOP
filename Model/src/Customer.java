import java.util.ArrayList;

public class Customer extends Human {
    private ArrayList<Book> reservedBooks;
    public Customer(String fName, String lName) {
        super(fName, lName);
        reservedBooks = new ArrayList<>();
    }
    public ArrayList<Book> getBooks() {
        return this.reservedBooks;
    }
}
