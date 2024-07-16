package Interface;

import Model.Author;

public interface AuthorInterface {
    public Author findAuthor(String fName, String lName);
    public void addAuthor(Author newAuthor);
    public void removeAuthor(Author author);

}
