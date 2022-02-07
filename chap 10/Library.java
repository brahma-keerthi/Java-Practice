import java.util.Scanner;

class Books {
    private String[] total, borrowed;
    private final int max = 5;
    private int numBook = -1;
    private int num = -1;
    private int n = -1, count = -1;
    private int[] index;
    private int N = -1;

    Books() {
        total = new String[max];
        borrowed = new String[max];
        index = new int[max];
    }

    void addBook(String name) {
        if (numBook == max-1) {
            System.out.println("No shelf space left. You can't add new books");
            return;
        }

        else {
            total[++numBook] = name;
            num++;
            System.out.println("New book " + name + " is added");
            return;
        }
    }

    void issueBook(String name) {
        if (numBook == -1 || num ==-1) {
            System.out.println("No books are Available at the moment");
            return;
        }

        else {
            int flag = 0;
            for(String i : total) {
                count++;
                if (i.equalsIgnoreCase(name)) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("There is no book in name of " + name);
                return;
            }
            index[++N] = count;
            borrowed[++n] = name;
            System.out.println("Issued Book " + name);
            total[count] = null;
            num--;
            return;
        }
    }

    void availBooks() {
        if (num == -1 || numBook == -1) {
            System.out.println("No books are available");
            return;
        }
        System.out.println("The available books are>> ");
        for (String i : total) {
            System.out.println(i);
        }
        
        return;
    }

    void returnBooks(String name) {
        int flag = 0;
        for (String i : borrowed) {
            if (i.equalsIgnoreCase(name)) {
                flag = 1;
                n--;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("You have not borrowed " + name);
            return;
        }

        System.out.println("Thanks for returning");
        total[index[N--]] = name;
        return;
    }

    void borrowedBooks(){
        if(n==-1){
            System.out.println("No Borrowed Books");
            return;
        }
        else{
            System.out.println("The borrowed books are>> ");
            for (String i : borrowed) {
                System.out.println(i);                
            }
        }
    }
}

public class Library {
    public static void main(String[] args) {
        Books b = new Books();
        Scanner sc = new Scanner(System.in);
        String name;

        for (;;) {
            System.out.println(
                    "\n\n!!!!___LIBRARY___!!!!\n1.ADD BOOK\n2.ISSUE BOOK\n3.RETURN BOOK\n4.CHECK FOR AVAIABILITY OF BOOKS\n5.BORROWED BOOKS");
            System.out.println("Enter your choice>> ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter name of Book>> ");
                    name = sc.next();
                    b.addBook(name);
                    break;

                case 2:
                    System.out.println("Enter name of book>> ");
                    name = sc.next();
                    b.issueBook(name);
                    break;

                case 3:
                    System.out.println("Enter the book name>> ");
                    name = sc.next();
                    b.returnBooks(name);
                    break;

                case 4:
                    System.out.println("Check the available books>> ");
                    b.availBooks();
                    break;

                case 5:
                    b.borrowedBooks();
                    break;

                default:
                    System.exit(0);
            }
        }
    }
}