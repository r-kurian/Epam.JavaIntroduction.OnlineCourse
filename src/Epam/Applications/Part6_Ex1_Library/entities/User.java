package Epam.Applications.Part6_Ex1_Library.entities;

public class User {

    private static int genID = 1;
    private int id;
    private String username;
    private String login;
    private String password;
    private EUserType userType;
    private Email email;

    public User(int id) {
        this.id = genID++;
    }

    public User(String login, String password) {
        if (login != null && password != null) {
            this.login = login;
            this.password = password;
        }
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EUserType getUserType() {
        return userType;
    }

    public void setUserType(EUserType userType) {
        this.userType = userType;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
}
