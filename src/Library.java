import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private int totalBooks;
    public Library() {
        totalBooks = 0;
    }
    public int getTotalBooks() {
        return totalBooks;
    }
    public void addBook(Book newBook) {
        books.add(newBook);
        totalBooks++;
    }
    public void removeBook(Book book) {
        books.remove(book);
        totalBooks--;
    }
    public void displayBooks() {
        System.out.println("Displaying all books:");
        for (Book tempBook : books) {
            System.out.println("Book's title:" + tempBook.getBookTitle());
            System.out.println("Book's ID:" + tempBook.getBookID());
            System.out.println("Book's author:");
        }
    }
}
