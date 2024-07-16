package Service;

import Interface.AuthorInterface;
import Model.Author;

import java.util.ArrayList;

public class AuthorService implements AuthorInterface {
    private ArrayList<Author> authors;
    public AuthorService() {
        authors = new ArrayList<>();
    }
    @Override
    public Author findAuthor(String fName, String lName) {
        for (Author tempAuthor : authors) {
            if ((tempAuthor.getFirstName()).equals(fName) && (tempAuthor.getLastName()).equals(lName)) {
                return tempAuthor;
            }
        }
        return null;
    }
    @Override
    public void addAuthor(Author newAuthor) {
        authors.add(newAuthor);
    }
    @Override
    public void removeAuthor(Author author) {
        authors.remove(author);
    }
}
