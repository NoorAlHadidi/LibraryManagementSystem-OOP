public class NonFictionBook extends Book{
    public NonFictionBook(String id, String title, Author author) {
        super(id, title, author);
    }
    @Override
    public String getGenre() {
        return "Non-Fiction";
    }
}

