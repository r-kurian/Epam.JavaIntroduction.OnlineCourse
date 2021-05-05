package Epam.Applications.Part6_Ex1_Library.utils;


import Epam.Applications.Part6_Ex1_Library.entities.EUserType;
import Epam.Applications.Part6_Ex1_Library.entities.User;

import java.util.Iterator;
import java.util.List;

public class UserUtil {

    private static List<User> users;

    static {
        users = FileManager.loadUsers();
    }

    public static List<User> getUsers() {
        return users;
    }

    public static User getAdmin() {
        for (User user : users) {
            if (user.getUserType().getName().equalsIgnoreCase("admin")) {
                return user;
            }
        }
        return null;
    }

    public static User login(String username, String password) {
        for (User user : users) {
            if (user.getLogin()
                    .equalsIgnoreCase(username) && PasswordUtil.verifyUserPassword(password, user.getPassword())) {
                return user;
            }
        }

        return null;
    }

    public static boolean isUserExist(String login) {
        return users.stream().anyMatch(u -> u.getLogin().equalsIgnoreCase(login));
    }

    static boolean addUser() {
        System.out.print("Enter login: ");
        String login = InputUtil.checkInputLine();
        List<User> users = UserUtil.getUsers();
        if (UserUtil.isUserExist(login)) {
            System.out.println("The user with \"" + login + "\" is exist!");
            return false;
        }
        System.out.print("Enter password: ");
        String password = InputUtil.checkInputLine();
        String encryptedPassword = PasswordUtil.md5Custom(password);
        System.out.print("Enter name: ");
        String name = InputUtil.checkInputLine();
        User user = new UserBuilder(login, encryptedPassword).setName(name).setUserType(EUserType.USER).build();
        users.add(user);
        FileManager.saveUserList(users);
        return true;
    }

    static boolean removeUser() {
        System.out.print("Enter login: ");
        String login = InputUtil.checkInputLine();
        List<User> users = UserUtil.getUsers();
        if (!UserUtil.isUserExist(login)) {
            System.out.println("The user with \"" + login + "\" does not exist!");
            return false;
        }
        System.out.print("Enter password: ");
        String password = InputUtil.checkInputLine();
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (login.equalsIgnoreCase(user.getLogin())){
                String encryptedPassword = PasswordUtil.md5Custom(password);
                if (encryptedPassword.equalsIgnoreCase(user.getPassword())){
                    iterator.remove();
                }
            }
        }
        FileManager.saveUserList(users);
        return true;
    }

    public static boolean isAdmin(User user) {
        return user.getUserType() == EUserType.ADMIN;
    }
}
