import java.util.ArrayList;

public class Book {

    private String title;
    private String author;
    private int year;
    private double rating;
    private ArrayList<String> reviews;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.rating = 0;
        this.reviews = new ArrayList<String>();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    public int getNumberOfReviews() {
        return reviews.size();
    }

    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews.size());
    }
}