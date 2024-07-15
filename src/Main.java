import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AuthorService authorServ = new AuthorService();
        CustomerService customerServ = new CustomerService();
        BookService bookServ = new BookService();
        //initializing the library with books and authors
        System.out.println("Enter the number of books you'd like to add:");
        int numBooks = scanner.nextInt();
        for (int i = 0; i < numBooks; i++) {
            scanner.nextLine();
            Book newBook = null;
            String bookID;
            System.out.println("Enter book ID:");
            while (true) {
                bookID = scanner.nextLine();
                if (bookServ.findBook(bookID) == null) {
                    break;
                }
                System.out.println("Book already exists, enter a new ID:");
            }
            System.out.println("Enter book title: ");
            String bookTitle = scanner.nextLine();
            System.out.println("Enter author's name (First Last): ");
            String authorName = scanner.nextLine();
            String[] authorDetails = authorName.split(" ");
            Author bookAuthor = new Author(authorDetails[0], authorDetails[1]);
            if (authorServ.findAuthor(authorDetails[0], authorDetails[1]) == null) {
                authorServ.addAuthor(bookAuthor);
            }
            System.out.println("Enter book genre (for fiction, enter 1 and for non-fiction, enter 2):");
            int bookGenre;
            while (true) {
                bookGenre = scanner.nextInt();
                if (bookGenre == 1) {
                    newBook = new Book(bookID, bookTitle, bookAuthor, "Fiction");
                    break;
                }
                else if (bookGenre == 2) {
                    newBook = new Book(bookID, bookTitle, bookAuthor, "Non-Fiction");
                    break;
                }
                else {
                    System.out.println("Re-enter correct genre:");
                }
            }
            bookServ.addBook(newBook);
        }
        //removing a book
        System.out.println("Enter the ID of the book to be removed:");
        scanner.nextLine();
        String removeID;
        while (true) {
            removeID = scanner.nextLine();
            if (bookServ.findBook(removeID) != null) {
                bookServ.removeBook(bookServ.findBook(removeID));
                break;
            }
            System.out.println("Book doesn't exist, re-enter correct ID:");
        }
        //displaying all books
        bookServ.displayBooks();
        //retrieving books written by an author
        System.out.println("Enter the author of the books you want to retrieve (First Last):");
        String authorName;
        while (true) {
            authorName = scanner.nextLine();
            String[] authorDetails = authorName.split(" ");
            if (authorServ.findAuthor(authorDetails[0], authorDetails[1]) != null) {
                bookServ.retrieveBook(authorServ.findAuthor(authorDetails[0], authorDetails[1]));
                break;
            }
            System.out.println("Author doesn't exist, re-enter correct name:");
        }
        //customer borrowing book (remove from library and add to customer books array)
        System.out.println("Enter customer name (First Last): ");
        String customerName = scanner.nextLine();
        String[] customerDetails = customerName.split(" ");
        Customer bookCustomer = new Customer(customerDetails[0], customerDetails[1]);
        if (customerServ.findCustomer(customerDetails[0], customerDetails[1]) == null) {
            customerServ.addCustomer(bookCustomer);
        }
        System.out.println("Enter the ID of the book to be borrowed:");
        String borrowID;
        while (true) {
            borrowID = scanner.nextLine();
            if (bookServ.findBook(borrowID) != null) {
                if ((bookServ.findBook(borrowID)).getCustomer() == null) {
                    (bookServ.findBook(borrowID)).setCustomer(customerServ.findCustomer(customerDetails[0], customerDetails[1]));
                    break;
                }
                else {
                    System.out.println("Book is already borrowed, re-enter another book ID:");
                }
            }
            else {
                System.out.println("Book doesn't exist, re-enter correct ID:");
            }
        }
        //customer returning book (remove from customer's books and add to library)
        //using same customer from above example
        System.out.println("Enter the ID of the book to be returned:");
        String returnID;
        while (true) {
            returnID = scanner.nextLine();
            if (bookServ.findBook(returnID) != null) {
                if ((bookServ.findBook(returnID)).getCustomer() != null) {
                    (bookServ.findBook(borrowID)).setCustomer(null);
                    break;
                }
                else {
                    System.out.println("Book is already returned, re-enter another book ID:");
                }
            }
            else {
                System.out.println("Book doesn't exist, re-enter correct ID:");
            }
        }
        scanner.close();
    }
}
