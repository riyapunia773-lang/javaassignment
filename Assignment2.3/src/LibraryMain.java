public class LibraryMain {

    public static void main(String[] args) {



        Book book1 = new Book(
                "Introduction to Java Programming",
                "John Smith", 2020);

        Book book2 = new Book(
                "Data Structures and Algorithms",
                "Jane Doe", 2018);

        Book book3 = new Book(
                "The Art of Fiction",
                "Alice Johnson", 2019);

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        System.out.println("Books by Jane Doe:");

        library.findBooksByAuthor("Jane Doe");




        System.out.println("\nTASK 2");

        library.borrowBook("The Art of Fiction");

        library.returnBook(book3);




        System.out.println("\nTASK 3");

        System.out.println(
                "Is Java book available? "
                        + library.isBookAvailable(
                        "Introduction to Java Programming"));




        System.out.println("\nTASK 4");

        book1.setRating(4.5);
        book1.addReview("Very useful book.");
        book1.addReview("Easy to understand.");

        book2.setRating(5.0);
        book2.addReview("Excellent book.");

        book3.setRating(4.0);




        System.out.println("\nTASK 5");

        System.out.println(
                "Average rating: "
                        + library.getAverageBookRating());

        Book mostReviewed = library.getMostReviewedBook();

        if (mostReviewed != null) {

            System.out.println(
                    "Most reviewed book: "
                            + mostReviewed.getTitle());
        }




        System.out.println("\nTASK 6");

        User user1 = new User("Alex", 20);
        User user2 = new User("Sarah", 22);

        library.addUser(user1);
        library.addUser(user2);

        library.displayUsers();

        library.borrowBook(
                user1, "Introduction to Java Programming");

        user1.displayBorrowedBooks();

        library.returnBook(user1, book1);




        System.out.println("\nFinal Library Books:");

        library.displayBooks();

        System.out.println("All 6 tasks completed.");
    }
}