package Epam.Applications.Part6_Ex1_Library.entities;

public class Book {
    private String author;
    private String title;
    private int year;
    private int pages;
    private EBookType type;

    public Book() {
    }

    protected boolean isValidString(String string) {
        return string != null && !string.isEmpty();
    }

    public Book(String author, String title, int year, int pages, EBookType type) {
        if (year > 0 && pages > 0 && isValidString(author) && isValidString(title)) {
            this.author = author;
            this.title = title;
            this.year = year;
            this.pages = pages;
            this.type = type;
        }
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public EBookType getType() {
        return type;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setType(EBookType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (year != book.year) return false;
        if (!author.equals(book.author)) return false;
        if (!title.equals(book.title)) return false;
        return type == book.type;
    }

    @Override
    public int hashCode() {
        int result = author.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + year;
        result = 31 * result + type.hashCode();
        return result;
    }
}
