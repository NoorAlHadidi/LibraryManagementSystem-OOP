import java.util.ArrayList;

public class BookService implements BookInterface{
    private ArrayList<Book> books = new ArrayList<>();
    @Override
    public Book findBook(String id) {
        for (Book tempBook : books) {
            if ((tempBook.getBookID()).equals(id)) {
                return tempBook;
            }
        }
        return null;
    }
    //add new book
    @Override
    public void addBook(Book newBook) {
        books.add(newBook);
    }
    //remove a book
    @Override
    public void removeBook(Book book) {
        books.remove(book);
    }
    //display all books
    @Override
    public void displayBooks() {
        System.out.println("Displaying all books");
        for (Book tempBook : books) {
            System.out.println("Book's title: " + tempBook.getBookTitle());
            System.out.println("Book's ID: " + tempBook.getBookID());
            System.out.println("Book's author: " + (tempBook.getBookAuthor()).getFirstName() + " " + (tempBook.getBookAuthor()).getLastName());
            System.out.println("----------");
        }
    }
    //retrieve author's work
    @Override
    public void retrieveBook(Author author) {
        System.out.println("Retrieving the books written by " + author.getFirstName() + " " + author.getLastName());
        for (Book tempBook : author.getBooks()) {
            System.out.println("Book's title: " + tempBook.getBookTitle());
            System.out.println("Book's ID: " + tempBook.getBookID());
            System.out.println("----------");
        }
    }
}

