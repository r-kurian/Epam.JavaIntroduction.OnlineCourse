package Epam.Programming_with_classes.Part4_1_Classes_And_Objects.Part4_1_Ex9;

/*
Book: id, title, author (s), publisher, year of publication, number of pages, price, type of cover.

Find:
a) a list of books by a given author;
b) a list of books issued by a given publisher;
c) a list of books released after a given year.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookArray {

    private static final List<Book> bookArrayList = new ArrayList<>();

    public BookArray(Book... books) {
        Collections.addAll(bookArrayList, books);
    }

    public void sortedByAuthor() {
        System.out.println("Book ID - Title - Author - Publisher - Year of Publication - Pages - Price - Cover");
        System.out.println("----------------------------------------------------------------------------------");

        bookArrayList.stream().sorted(Comparator.comparing(Book::getAuthor))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void sortedByPublisher() {
        System.out.println("Book ID - Title - Author - Publisher - Year of Publication - Pages - Price - Cover");
        System.out.println("----------------------------------------------------------------------------------");

        bookArrayList.stream().sorted(Comparator.comparing(Book::getPublisher))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void filterByYearOfPublication(int startYearOfPublication, int endYearOfPublication) {
        System.out.println("Book ID - Title - Author - Publisher - Year of Publication - Pages - Price - Cover");
        System.out.println("----------------------------------------------------------------------------------");

        bookArrayList.stream().filter(x -> x.getYearOfPublication() >= startYearOfPublication
                && x.getYearOfPublication() <= endYearOfPublication)
                .forEach(System.out::println);
    }

    public static void filterByPriceRange(double startIndex, double endIndex) {
        System.out.println("Book ID - Title - Author - Publisher - Year of Publication - Pages - Price - Cover");
        System.out.println("----------------------------------------------------------------------------------");

        bookArrayList.stream().filter(x -> x.getPrice() >= startIndex
                && x.getPrice() <= endIndex)
                .forEach(System.out::println);
    }
}
