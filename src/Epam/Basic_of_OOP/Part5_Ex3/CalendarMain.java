package Epam.Basic_of_OOP.Part5_Ex3;

/* Create a Calendar class with an inner class that can be used to store information
about weekends and holidays.*/

/* Создать класс Календарь с внутренним классом,
с помощью объектов которого можно хранить информацию о выходных и праздничных днях. */


import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.util.Scanner;

public class CalendarMain {
    public static void main(String[] args) {

        System.out.println("""

                * To the calendar were already added the holidays of Bavaria and federal holidays of Germany;    \s
                * Calendar marks Saturday and Sunday as a weekend;     \s
                * User can add three of their own day-off;     \s
                * The program counts and shows all weekends, holidays and days-off in a given by User period of time.""");

        Calendar calendar = new Calendar();

        calendar.addHoliday(MonthDay.of(Month.DECEMBER, 1));
        calendar.addHoliday(MonthDay.of(Month.DECEMBER, 6));
        calendar.addHoliday(MonthDay.of(Month.APRIL, 2));
        calendar.addHoliday(MonthDay.of(Month.APRIL, 5));
        calendar.addHoliday(MonthDay.of(Month.MAY, 1));
        calendar.addHoliday(MonthDay.of(Month.MAY, 13));
        calendar.addHoliday(MonthDay.of(Month.MAY, 24));
        calendar.addHoliday(MonthDay.of(Month.JUNE, 3));
        calendar.addHoliday(MonthDay.of(Month.AUGUST, 15));
        calendar.addHoliday(MonthDay.of(Month.OCTOBER, 3));
        calendar.addHoliday(MonthDay.of(Month.NOVEMBER, 1));
        calendar.addHoliday(MonthDay.of(Month.DECEMBER, 25));
        calendar.addHoliday(MonthDay.of(Month.DECEMBER, 26));

        System.out.println("\nDo you want to enter some Days-Off, e.g. your Birthday etc.? Enter y / n");
        Scanner sc = new Scanner(System.in);
        String answerAboutDaysOffEntering = sc.next();
        if (answerAboutDaysOffEntering.equals("y")) {

            System.out.println("Then enter the date of the 1st day-off (acc. pattern yyyy-mm-dd):");
            String scDaysOff1 = sc.next();
            LocalDate myFirstDaysOff = LocalDate.parse(scDaysOff1);
            calendar.addDayOff(MonthDay.from(myFirstDaysOff));

            System.out.println("Enter the date of the 2nd day-off (acc. pattern yyyy-mm-dd):");
            String scDaysOff2 = sc.next();
            LocalDate mySecondDaysOff = LocalDate.parse(scDaysOff2);
            calendar.addDayOff(MonthDay.from(mySecondDaysOff));

            System.out.println("Enter the date of the 3rd day-off (acc. pattern yyyy-mm-dd):");
            String scDaysOff3 = sc.next();
            LocalDate myThirdDaysOff = LocalDate.parse(scDaysOff3);
            calendar.addDayOff(MonthDay.from(myThirdDaysOff));
        }

        System.out.println("\nFind out how many free days in total, taking into account your days-off, holidays and weekends in the period you specified:");
        System.out.println("Enter the START date of the period you are interested in (acc. pattern yyyy-mm-dd):");
        String scStartOfTimePeriod = sc.next();
        LocalDate startOfTimePeriod = LocalDate.parse(scStartOfTimePeriod);

        System.out.println("Enter the END date of the period you are interested in (acc. pattern yyyy-mm-dd):");
        String scEndOfTimePeriod = sc.next();
        LocalDate endOfTimePeriod = LocalDate.parse(scEndOfTimePeriod);

        calendar.showAllFreeDaysBetween(startOfTimePeriod, endOfTimePeriod);
    }
}