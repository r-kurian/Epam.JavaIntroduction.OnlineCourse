package Epam.Applications.Part6_Ex1_Library.entities;


public enum EBookType {

    PAPER("Paper book"), EBOOK("eBook");

    String name;

    EBookType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
