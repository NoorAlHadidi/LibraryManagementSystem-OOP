package Model;

public class Book {
    private String bookID;
    private String bookTitle;
    private Author bookAuthor;
    private String bookGenre;
    private Customer bookCustomer;
    public Book(String id, String title, Author author, String genre) {
        this.bookID = id;
        this.bookTitle = title;
        this.bookAuthor = author;
        this.bookGenre = genre;
        this.bookCustomer = null;
    }
    public String getBookID() {
        return this.bookID;
    }
    public String getBookTitle() {
        return this.bookTitle;
    }
    public Author getBookAuthor() {
        return this.bookAuthor;
    }
    public String getGenre() {
        return this.bookGenre;
    }
    public void setCustomer(Customer newCustomer) {
        this.bookCustomer = newCustomer;
    }
    public Customer getCustomer() {
        return this.bookCustomer;
    }
}