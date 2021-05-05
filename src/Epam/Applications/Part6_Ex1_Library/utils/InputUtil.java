package Epam.Applications.Part6_Ex1_Library.utils;


import Epam.Applications.Part6_Ex1_Library.entities.EBookType;
import Epam.Applications.Part6_Ex1_Library.entities.EUserType;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static String checkInputLine() {
        Pattern pattern = Pattern.compile("[\\D\\w ]{4,30}");
        scanner.useDelimiter("[\r\n]");
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("Invalid input. Make sure the line is between 4 and 30 characters long.");
        }
        return scanner.nextLine().trim();
    }

    public static int checkInputChoice(EUserType userType) {
        Pattern pattern;
        if(userType == EUserType.ADMIN) {
            pattern = Pattern.compile("[0-6[9]]");
        } else {
            pattern = Pattern.compile("[0-3[9]]");
        }
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("Not available operation. Try again.");
        }
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    public static int checkInputYear() {
        Pattern pattern = Pattern.compile("[\\d ]{4}");
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("The year should consist four digits, e.g. 1986.");
        }
        return scanner.nextInt();
    }

    public static EBookType checkInputBookType() {
        Pattern pattern = Pattern.compile("[1-2]");
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("Invalid input. Try again.");
        }
        if (scanner.nextInt() == 1) {
            return EBookType.EBOOK;
        } else return EBookType.PAPER;
    }

    public static int checkPageNumber() {
        Pattern pattern = Pattern.compile("[\\d]");
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("Invalid input. Try again.");
        }
        return scanner.nextInt();
    }
}
