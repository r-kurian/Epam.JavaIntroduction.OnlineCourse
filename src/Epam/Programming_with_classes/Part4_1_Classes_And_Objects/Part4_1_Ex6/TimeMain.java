package Epam.Programming_with_classes.Part4_1_Classes_And_Objects.Part4_1_Ex6;

/* Составьте описание класса для представления времени.
Предусмотрите возможности установки времени и изменения его отдельных полей (час, минута, секунда)
с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0.
Создать методы изменения времени на заданное количество часов, минут и секунд.

Write a class time. Provide the possibility of setting the time
and changing its individual fields  (hour, minute, second) while checking the validity of the entered values.
In case of invalid field values, the field is set to 0.
Create methods for changing the time by the specified number of hours, minutes and seconds.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class TimeMain {

    public static int hours, minutes, seconds, menuPoint,
            addedHours, addedMinutes, addedSeconds;

    public static void main(String[] args) {
        try {

            System.out.println("\nSet-up the TIME. " +
                    "\nIf your values will be out of time-range, the program automatically sets them to \"0\".");
            Time time = new Time(hours, minutes, seconds);

            Scanner sc = new Scanner(System.in);

            System.out.println("\n---> Set-up the HOURS in 24h-range:");
            hours = sc.nextInt();

            System.out.println("---> Set-up the MINUTES:");
            minutes = sc.nextInt();

            System.out.println("---> Set-up the SECONDS:");
            seconds = sc.nextInt();

            time.setTime(hours, minutes, seconds);
            System.out.println("\nYOUR TIME: " + time.toString());

            System.out.println("\nTo add another time to the time you set, choose the MENU actions: " +
                    "\nEnter 1 to add HOURS;    2 to add MINUTES;   3 to add SECONDS;   0 to EXIT the program;");

            menuPoint = sc.nextInt();
            switch (menuPoint) {
                case 1 -> {
                    time.setTimeWithAddedHours(addedHours);
                    System.out.println("\nYour NEW time: " + time.toString());
                }
                case 2 -> {
                    time.setTimeWithAddedMinutes(addedMinutes);
                    System.out.println("\nYour NEW time: " + time.toString());
                }
                case 3 -> {
                    time.setTimeWithAddedSeconds(addedSeconds);
                    System.out.println("\nYour NEW time: " + time.toString());
                }
                case 0 -> System.exit(0);
                default -> System.out.println("Enter the number only from menu options, namely 1, 2 or 3.\n");
            }

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
