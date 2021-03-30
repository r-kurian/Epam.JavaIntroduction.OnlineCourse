package Epam.Programming_with_classes.Part4_1_Classes_And_Objects.Part4_1_Ex9;

/*
Создать класс Book, спецификация которого приведена ниже.
Определить конструкторы, set- и get- методы и метод toString().

Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.

Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.

Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
*/

/*
Create a class of a Book. Define constructors, set and get methods, and the toString () method.

Create a second class that aggregates an array of type Book with appropriate constructors and methods.
Set the criteria for selecting data and display this data on the console.

Book: id, title, author (s), publisher, year of publication, number of pages, price, type of cover.

Find:
a) a list of books by a given author;
b) a list of books issued by a given publisher;
c) a list of books released after a given year.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookMain {

    static BookArray topAmazonJavaBooks = new BookArray(
            new Book("Effective Java; 3. Edition", "Joshua Bloch", "Addison-Wesley Professional", 2017, 416, 45.18, Book.Cover.SOFTCOVER_PAPERBACK),
            new Book("Head First Design Patterns", "Eric Freeman", "O'Reilly Media", 2020, 672, 41.45, Book.Cover.NOT_DEFINED),
            new Book("Head First Java, 2nd Edition", "Kathy Sierra", "O'Reilly Media", 2005, 688, 18.99, Book.Cover.NOT_DEFINED),
            new Book("Building Java Programs: A Back to Basics Approach", "Stuart Reges", "Pearson", 2019, 1232, 59.19, Book.Cover.HARDCOVER_CASE_WRAP),
            new Book("Beginning Programming with Java For Dummies", "Barry Burd", "For Dummies", 2017, 560, 10.10, Book.Cover.SOFTCOVER_PAPERBACK),
            new Book("Java: Learn Java in One Day and Learn It Well", "Jamie Chan", "Independently published", 2016, 235, 11.67, Book.Cover.SOFTCOVER_PAPERBACK),
            new Book("Microservices Patterns: With examples in Java", "Chris Richardson", "Manning Publications", 2018, 520, 36.47, Book.Cover.HARDCOVER_CASE_WRAP),
            new Book("Java ist auch eine Insel", "Christian Ullenboom", "Rheinwerk Computing", 2020, 1246, 49.90, Book.Cover.HARDCOVER_DUST_JACKET),
            new Book("Java: The Complete Reference, 11-th Edition", "Herbert Schildt", "McGraw-Hill Education", 2018, 1248, 40.27, Book.Cover.HARDCOVER_DUST_JACKET)
    );

    public static void main(String[] args) {
        try {

            System.out.println("\n>>> Welcome to the Amazon's JAVA-Book bestsellers! <<<");

            Scanner sc = new Scanner(System.in);
            System.out.println("\n" +
                    "To sort the JAVA-Book bestsellers use menu:" +
                    "\nEnter:  " +
                    "\n 1 to sort by the Author (A-Z);      2 to sort by the Publisher (A-Z);  " +
                    "\n 3 to filter by Publication's Year;  4 to filter by the Price-Range;  " +
                    "\n 0 to EXIT the program;");

            int menuPoint = sc.nextInt();

            switch (menuPoint) {
                case 1 -> {
                    System.out.println("\nSorted by the author (A-Z)");
                    topAmazonJavaBooks.sortedByAuthor();
                }
                case 2 -> {
                    System.out.println("\nSorted by the publisher (A-Z)");
                    topAmazonJavaBooks.sortedByPublisher();
                }
                case 3 -> {
                    System.out.println("\n>>> Enter start and end years of book publications time-range:");
                    int startYearOfPublication = sc.nextInt();
                    int endYearOfPublication = sc.nextInt();
                    topAmazonJavaBooks.filterByYearOfPublication(startYearOfPublication, endYearOfPublication);
                }
                case 4 -> {
                    System.out.println("\n>>> Enter two indexes for the beginning and the end of price-range:");
                    double startIndex = sc.nextDouble();
                    double endIndex = sc.nextDouble();
                    BookArray.filterByPriceRange(startIndex, endIndex);
                }
                case 0 -> System.exit(0);
                default -> System.out.println("Enter the number only from menu options, namely 1, 2, 3, 4 or 0.\n");
            }

        } catch (IllegalArgumentException |
                InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
