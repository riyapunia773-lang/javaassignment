
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Book> allBooks;
    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<Book>();
        allBooks = new ArrayList<Book>();
        users = new ArrayList<User>();
    }


    public void addBook(Book book) {
        books.add(book);
        allBooks.add(book);
    }


    public void displayBooks() {
        System.out.println("Library Catalog:");

        for (Book book : books) {
            book.displayBook();
            System.out.println();
        }
    }


    public void findBooksByAuthor(String author) {
        for (Book book : allBooks) {

            if (book.getAuthor().equalsIgnoreCase(author)) {
                book.displayBook();
            }
        }
    }


    public void borrowBook(String title) {

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);

                System.out.println("Book borrowed: " + title);
                return;
            }
        }

        System.out.println("Book is not available.");
    }


    public void returnBook(Book book) {

        if (!books.contains(book)) {
            books.add(book);

            System.out.println("Book returned: "
                    + book.getTitle());
        }
    }


    public boolean isBookAvailable(String title) {

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }

        return false;
    }


    public double getAverageBookRating() {

        double total = 0;
        int count = 0;

        for (Book book : allBooks) {

            if (book.getRating() > 0) {
                total = total + book.getRating();
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }

        return total / count;
    }


    public Book getMostReviewedBook() {

        Book mostReviewed = null;
        int highest = 0;

        for (Book book : allBooks) {

            if (book.getNumberOfReviews() > highest) {

                highest = book.getNumberOfReviews();
                mostReviewed = book;
            }
        }

        return mostReviewed;
    }


    public void addUser(User user) {
        users.add(user);
    }


    public User findUser(String name) {

        for (User user : users) {

            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }

        return null;
    }


    public void removeUser(String name) {

        User user = findUser(name);

        if (user != null &&
                user.getBorrowedBookCount() == 0) {

            users.remove(user);
            System.out.println("User removed.");

        } else {
            System.out.println("User not found or has borrowed books.");
        }
    }


    public void displayUsers() {

        System.out.println("Library Users:");

        for (User user : users) {

            System.out.println(
                    user.getName() + ", Age: " + user.getAge());
        }
    }


    public void borrowBook(User user, String title) {

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {

                books.remove(book);
                user.borrowBook(book);

                System.out.println(user.getName()
                        + " borrowed " + title);

                return;
            }
        }

        System.out.println("Book is not available.");
    }


    public void returnBook(User user, Book book) {

        user.returnBook(book);
        books.add(book);

        System.out.println(user.getName()
                + " returned " + book.getTitle());
    }
}