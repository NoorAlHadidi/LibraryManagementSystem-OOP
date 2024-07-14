import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Author> authors = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();
    //checks availability of book by ID
    public boolean findBook(String id) {
        for (Book tempBook : books) {
            if ((tempBook.getBookID()).equals(id)) {
                return true;
            }
        }
        return false;
    }
    //checks availability of author by name
    public Author findAuthor(String fName, String lName) {
        for (Author tempAuthor : authors) {
            if ((tempAuthor.getFirstName()).equals(fName) && (tempAuthor.getLastName()).equals(lName)) {
                return tempAuthor;
            }
        }
        return null;
    }
    //checks availability of customer by name
    public Customer findCustomer(String fName, String lName) {
        for (Customer tempCustomer : customers) {
            if ((tempCustomer.getFirstName()).equals(fName) && (tempCustomer.getLastName()).equals(lName)) {
                return tempCustomer;
            }
        }
        return null;
    }
    //add new book
    public void addBook(Book newBook) {
        books.add(newBook);
    }
    //remove a book
    public void removeBook(Book book) {
        books.remove(book);
    }
    //display all books
    public void displayBooks() {
        System.out.println("Displaying all books:");
        for (Book tempBook : books) {
            System.out.println("Book's title: " + tempBook.getBookTitle());
            System.out.println("Book's ID: " + tempBook.getBookID());
            System.out.println("Book's author: " + (tempBook.getBookAuthor()).getFirstName() + " " + (tempBook.getBookAuthor()).getLastName());
            System.out.println("----------");
        }
    }
    //retrieve author's work
    public void retrieveBook(Author author) {
        System.out.println("Retrieving the books written by " + author.getFirstName() + " " + author.getLastName());
        for (Book tempBook : author.getBooks()) {
            System.out.println("Book's title:" + tempBook.getBookTitle());
            System.out.println("Book's ID:" + tempBook.getBookID());
            System.out.println("----------");
        }
    }
}