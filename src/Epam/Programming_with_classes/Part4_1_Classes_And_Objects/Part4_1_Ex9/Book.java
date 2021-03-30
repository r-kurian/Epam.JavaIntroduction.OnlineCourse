package Epam.Programming_with_classes.Part4_1_Classes_And_Objects.Part4_1_Ex9;

/*
Book: id, title, author (s), publisher, year of publication, number of pages, price, type of cover.

Find:
a) a list of books by a given author;
b) a list of books issued by a given publisher;
c) a list of books released after a given year.
*/

public class Book {

    private static int idCounter;

    private int id;
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublication;
    private int numberOfPages;
    private double price;
    private Cover cover;

    public Book(String title, String author, String publisher, int yearOfPublication, int numberOfPages, double price, Cover cover) {
        this.id += ++idCounter; // or id += ++idCounter ???
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.cover = cover;
    }

    public enum Cover {
        HARDCOVER_DUST_JACKET,
        HARDCOVER_CASE_WRAP,
        SOFTCOVER_PAPERBACK,
        NOT_DEFINED
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "ID: " +id +
                ". " + title +
                ", " + author +
                ". " + publisher +
                ", " + yearOfPublication +
                ". " + numberOfPages +
                " pages, Price = " + price +
                ". Cover: " + cover;
    }
}
