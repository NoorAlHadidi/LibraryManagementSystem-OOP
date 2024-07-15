public interface BookInterface {
    public Book findBook(String id);
    public void addBook(Book newBook);
    public void removeBook(Book book);
    public void displayBooks();
    public void retrieveBook(Author author);
}
