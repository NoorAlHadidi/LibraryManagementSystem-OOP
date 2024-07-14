import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        System.out.println("Enter the number of books you'd like to add: ");
        int numBooks = scanner.nextInt();
        for (int i = 0; i < numBooks; i++) {
            Book newBook;
            System.out.println("Enter book ID: ");
            String bookID = scanner.nextLine();
            if (library.findBook(bookID) == true) {
                System.out.println("Book already exists, enter a new ID: ");
                bookID = scanner.nextLine();
            }
            System.out.println("Enter book title: ");
            String bookTitle = scanner.nextLine();
            System.out.println("Enter author's name: ");
            String authorName = scanner.nextLine();
            String[] authorDetails = authorName.split(" ");
            Author bookAuthor = new Author(authorDetails[0], authorDetails[1]);
            System.out.println("Enter book genre: ");
            String bookGenre = scanner.nextLine();
            if (bookGenre.equals("Fiction")) {
                newBook = new FictionBook(bookID, bookTitle, bookAuthor);
            }
            else if (bookGenre.equals("Non Fiction")) {
                newBook = new NonFictionBook(bookID, bookTitle, bookAuthor);
            }
        }
    }
}
