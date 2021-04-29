package Epam.Basic_of_OOP.Part5_Ex3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.util.HashSet;
import java.util.Set;

public class Calendar {
    private final Set<MonthDay> allFreeDays = new HashSet<>();
    FreeDays myFreeDays;

    public Calendar() {
        this.myFreeDays = new FreeDays();
    }

    public void addHoliday(final MonthDay monthDay) {
        allFreeDays.add(monthDay); // given by Admin
    }

    public void addDayOff(final MonthDay monthDay) {
        allFreeDays.add(monthDay); // given by User
    }

    public void showAllFreeDaysBetween(final LocalDate startInclusive, final LocalDate endInclusive) {
        System.out.println("All free days (days-off + holidays + weekends) in a given period of time: "
                + myFreeDays.numberOfAllFreeDaysBetween(startInclusive, endInclusive));

        if (startInclusive != null || endInclusive != null) {
            for (LocalDate i = startInclusive; !i.isAfter(endInclusive); i = i.plusDays(1)) {
                if (myFreeDays.isHoliday(i)) {
                    System.out.println(i + "  " + i.getDayOfWeek());
                }
            }
        } else {
            throw new NullPointerException("Entered date can not be null.");
        }
    }


    private class FreeDays {

        public boolean isHoliday(final LocalDate localDate) {
            return isWeekend(localDate) || allFreeDays.contains(toMonthDay(localDate));
        }

        public int numberOfAllFreeDaysBetween(final LocalDate startInclusive, final LocalDate endInclusive) {
            int c = 0;
            for (LocalDate i = startInclusive; !i.isAfter(endInclusive); i = i.plusDays(1)) {
                if (isHoliday(i)) {
                    c++;
                }
            }
            return c;
        }

        public boolean isWeekend(final LocalDate localDate) {
            final DayOfWeek dow = localDate.getDayOfWeek();
            return dow == DayOfWeek.SATURDAY || dow == DayOfWeek.SUNDAY;
        }

        public MonthDay toMonthDay(final LocalDate localDate) {
            return MonthDay.of(localDate.getMonth(), localDate.getDayOfMonth());
        }
    }
}