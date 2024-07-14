import java.util.ArrayList;

public class Customer extends Human {
    private ArrayList<Book> reservedBooks = new ArrayList<>();
    public Customer(String fName, String lName, int num) {
        super(fName, lName, num);
    }
}
