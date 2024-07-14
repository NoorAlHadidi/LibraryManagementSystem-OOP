public abstract class Book {
    private String bookID;
    private String bookTitle;
    private Author bookAuthor;
    public Book(String id, String title, Author author) {
        this.bookID = id;
        this.bookTitle = title;
        this.bookAuthor = author;
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
    public abstract String getGenre();
}