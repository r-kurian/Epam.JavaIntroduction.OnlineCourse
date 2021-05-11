package Epam.Applications.Part6_Ex2_Notebook.utils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static String readInput() {
        return scanner.next().trim();
    }

    public static String checkInputSubject() {
        System.out.println("The subjects should be from 2 to 20 characters long.");
        Pattern pattern = Pattern.compile("[a-zA-Z_0-9]{2,20}");
        scanner.useDelimiter("[\r\n]");
        while (!scanner.hasNext(pattern)) {
            scanner.next();
            System.out.println("Invalid input. Make sure that the subject is between 2 and 20 characters long.");
        }
        return scanner.next().trim();
    }

    public static String checkInputYear() {
        Pattern pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
        while (!scanner.hasNext(pattern)) {
            scanner.next();
            System.out.println("The date should match the following format: \"yyyy-mm-dd\" ");
        }
        return scanner.next().trim();
    }

    public static String checkInputEmail() {
        Pattern pattern = Pattern.compile("([a-zA-Z0-9]+(?:[._+-][a-zA-Z0-9]+)*)@([a-zA-Z0-9]+(?:[.-][a-zA-Z0-9]+)*[.][a-zA-Z]{2,})");
        while (!scanner.hasNext(pattern)) {
            scanner.next();
            System.out.println("The email should match the following format: \"name@mail.com\" ");
        }
        return scanner.next().trim();
    }

    public static int checkOption() {
        Pattern pattern = Pattern.compile("[\\d]");
        while (!scanner.hasNext(pattern)) {
            scanner.next();
            System.out.println("Invalid input. Try again.");
        }
        return scanner.nextInt();
    }
}
