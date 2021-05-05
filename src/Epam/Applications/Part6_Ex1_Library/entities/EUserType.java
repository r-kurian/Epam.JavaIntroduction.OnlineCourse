package Epam.Applications.Part6_Ex1_Library.entities;

public enum EUserType {

    ADMIN("admin"), USER("user");

    private String name;

    EUserType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
