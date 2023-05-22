import java.util.Scanner;

public class project {
    static char r;

    public static void main(String[] args) {
        do {
            System.out.println("*************Library Management System************");
            System.out.println("Press 1 to add Book");
            System.out.println("Press 2 to issue a Book");
            System.out.println("Press 3 to return a Book");
            System.out.println("Press 4 to print complete issue details");
            System.out.println("Press 5 to exit");
            Scanner obj1 = new Scanner(System.in);
            System.out.println("Enter any number: ");
            int a = obj1.nextInt();
            Library library = new Library();
            switch (a) {
                case 1:
                    library.add();
                    break;
                case 2:
                    library.issue();
                    break;
                case 3:
                    library.ret();
                    break;
                case 4:
                    library.detail();
                    break;
                case 5:
                    library.exit();
                    break;
                default:
                    System.out.println("Invalid number! please enter the correct number.");
            }
            System.out.println("Do you want to select the next option? (Y/N)");
            r = obj1.next().charAt(0);
        } while (r == 'y' || r == 'Y');
    }
}

class Library {
    String bookName, issueDate, returnDate;
    int bookId, totalBooksIssued;

    void add() {
        System.out.println("Enter Book Name, Price, and Book Number: ");
        Scanner obj2 = new Scanner(System.in);
        bookName = obj2.nextLine();
        float price = obj2.nextFloat();
        bookId = obj2.nextInt();
        System.out.println("Your details are: " + bookName + ", " + price + ", " + bookId);
    }

    void issue() {
        Scanner obj3 = new Scanner(System.in);
        System.out.println("Book name: ");
        bookName = obj3.nextLine();
        System.out.println("Book ID: ");
        bookId = obj3.nextInt();
        obj3.nextLine();
        System.out.println("Issue date: ");
        issueDate = obj3.nextLine();
        System.out.println("Total number of Books Issued: ");
        totalBooksIssued = obj3.nextInt();
        obj3.nextLine();
        System.out.println("Return Book date: ");
        returnDate = obj3.nextLine();
    }

    int getBookId() {
        return bookId;
    }

    void ret() {
        System.out.println("Enter Student name & Book ID: ");
        Scanner c = new Scanner(System.in);
        String name = c.nextLine();
        int bookId = c.nextInt();
        if (this.bookId == bookId) {
            System.out.println("Total details");
            System.out.println("Book Name: " + bookName);
            System.out.println("Book ID: " + this.bookId);
            System.out.println("Issue Date: " + issueDate);
            System.out.println("Total number of Books issued: " + totalBooksIssued);
            System.out.println("Book return date: " + returnDate);
        } else {
            System.out.println("Wrong ID, please enter the correct ID.");
        }
    }

    void detail() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Book ID: " + bookId);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Total number of Books issued: " + totalBooksIssued);
        System.out.println("Book return date: " + returnDate);
    }

    void exit() {
        System.out.println("Thanks for using the Library. Hope to see you again.");
        System.exit(0);
    }
}
