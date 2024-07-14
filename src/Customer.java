import java.util.ArrayList;

public class Customer extends Human {
    private ArrayList<Book> reservedBooks = new ArrayList<>();
    public Customer(String fName, String lName) {
        super(fName, lName);
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
    //checks availability of book by ID
    public Book findBook(String id) {
        for (Book tempBook : reservedBooks) {
            if ((tempBook.getBookID()).equals(id)) {
                return tempBook;
            }
        }
        return null;
    }
}
