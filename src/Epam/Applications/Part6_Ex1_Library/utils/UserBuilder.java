package Epam.Applications.Part6_Ex1_Library.utils;


import Epam.Applications.Part6_Ex1_Library.entities.EUserType;
import Epam.Applications.Part6_Ex1_Library.entities.Email;
import Epam.Applications.Part6_Ex1_Library.entities.User;

public class UserBuilder {
    private User user;

    public UserBuilder(String login, String password) {
        user = new User(login, password);
    }

    public UserBuilder setName(String name){
        user.setUsername(name);
        return this;
    }

    public UserBuilder setUserType(EUserType userType){
        user.setUserType(userType);
        return this;
    }

    public UserBuilder setEmail(Email email) {
        user.setEmail(email);
        return this;
    }

    public User build(){
        return user;
    }
}
