package system;

import model.Book;
import model.LibraryMember;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<LibraryMember> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println("Added member: " + member.getName());
    }

    public void borrowBook(LibraryMember member, Book book) {
        if (book.isBorrowed()) {
            System.out.println("Sorry, " + book.getTitle() + " is already borrowed.");
        } else if (book.isReserved() && !member.hasReservedBook(book)) {
            System.out.println("Sorry, " + book.getTitle() + " is reserved by someone else.");
        } else {

            if (member.hasReservedBook(book)) {
                member.removeReservedBook(book);
                book.setReserved(false);
            }
            book.setBorrowed(true);
            member.addBorrowedBook(book);
            System.out.println(member.getName() + " borrowed " + book.getTitle());
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        if (member.getBorrowedBooks().contains(book)) {
            book.setBorrowed(false);
            member.removeBorrowedBook(book);
            System.out.println(member.getName() + " returned " + book.getTitle());
        } else {
            System.out.println(member.getName() + " did not borrow " + book.getTitle());
        }
    }


    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Reservation canceled successfully.");
        } else {
            System.out.println("Book was not reserved by this member.");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book book : member.getReservedBooks()) {
            System.out.println("- " + book.getTitle());
        }
    }
}
