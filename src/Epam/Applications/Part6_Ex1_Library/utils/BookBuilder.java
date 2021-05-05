package Epam.Applications.Part6_Ex1_Library.utils;


import Epam.Applications.Part6_Ex1_Library.entities.Book;
import Epam.Applications.Part6_Ex1_Library.entities.EBookType;

public class BookBuilder {
    private Book book;

    public BookBuilder() {
        this.book = new Book();
    }

    public BookBuilder setAuthor(String author) {
        book.setAuthor(author);
        return this;
    }

    public BookBuilder setTitle(String title) {
        book.setTitle(title);
        return this;
    }

    public BookBuilder setYear(int year) {
        book.setYear(year);
        return this;
    }

    public BookBuilder setType(EBookType type) {
        book.setType(type);
        return this;
    }

    public Book build() {
        return book;
    }
}
