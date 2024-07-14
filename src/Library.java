import java.util.ArrayList;
import java.util.Objects;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    //checks availability of book by ID
    public boolean findBook(String id) {
        for (Book tempBook : books) {
            if ((tempBook.getBookID()).equals(id)) {
                return true;
            }
        }
        return false;
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