public class FictionBook extends Book{
    public FictionBook(String id, String title, Author author) {
        super(id, title, author);
    }
    @Override
    public String getGenre() {
        return "Fiction";
    }
}
