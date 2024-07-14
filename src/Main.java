import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        //initializing the library with books
        System.out.println("Enter the number of books you'd like to add: ");
        int numBooks = scanner.nextInt();
        for (int i = 0; i < numBooks; i++) {
            scanner.nextLine();
            Book newBook = null;
            String bookID;
            System.out.println("Enter book ID: ");
            while (true) {
                bookID = scanner.nextLine();
                if (!library.findBook(bookID)) {
                    break;
                }
                System.out.println("Book already exists, enter a new ID: ");
            }
            System.out.println("Enter book title: ");
            String bookTitle = scanner.nextLine();
            System.out.println("Enter author's name (First Last): ");
            String authorName = scanner.nextLine();
            String[] authorDetails = authorName.split(" ");
            Author bookAuthor = new Author(authorDetails[0], authorDetails[1]);
            System.out.println("Enter book genre (for fiction, enter 1 and for non-fiction, enter 2): ");
            int bookGenre;
            while (true) {
                bookGenre = scanner.nextInt();
                if (bookGenre == 1) {
                    newBook = new FictionBook(bookID, bookTitle, bookAuthor);
                    break;
                }
                else if (bookGenre == 2) {
                    newBook = new NonFictionBook(bookID, bookTitle, bookAuthor);
                    break;
                }
                else {
                    System.out.println("Re-enter correct genre: ");
                }
            }
            library.addBook(newBook);
        }
    }
}
