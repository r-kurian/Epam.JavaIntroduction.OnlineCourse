package Epam.Programming_with_classes.Part4_1_Classes_And_Objects.Part4_1_Ex6;

import java.util.Scanner;

/* Write a class time. Provide the possibility of setting the time
and changing its individual fields  (hour, minute, second) while checking the validity of the entered values.
In case of invalid field values, the field is set to 0.
Create methods for changing the time by the specified number of hours, minutes and seconds.
*/
public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public void setHours(int hours) {
        if (hours < 0 || hours > 23)
            this.hours = 0;
        else
            this.hours = hours;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 59)
            this.minutes = 0;
        else
            this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 59)
            this.seconds = 0;
        else
            this.seconds = seconds;
    }

    public void setTimeWithAddedHours(int addedHours) {
        System.out.println("\n---> Add your HOURS:");

        try {

            Scanner sc = new Scanner(System.in);
            addedHours = sc.nextInt();

            if (addedHours > 0) {
                this.hours = (this.hours + addedHours) % 24;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setTimeWithAddedMinutes(int addedMinutes) {
        System.out.println("\n---> Add your MINUTES:");

        try {

            Scanner sc = new Scanner(System.in);
            addedMinutes = sc.nextInt();

            if (addedMinutes > 0) {
                this.minutes += addedMinutes;
                this.hours = (this.hours + this.minutes / 60) % 24;
                this.minutes %= 60;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setTimeWithAddedSeconds(int addedSeconds) {
        System.out.println("\n---> Add your SECONDS:");

        try {

            Scanner sc = new Scanner(System.in);
            addedSeconds = sc.nextInt();

            if (addedSeconds > 0) {
                this.seconds += addedSeconds;
                this.minutes = (this.minutes + this.seconds / 60);
                this.hours = (this.hours + this.minutes / 60) % 24;
                this.minutes %= 60;
                this.seconds %= 60;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setTime(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    @Override
    public String toString() {
        String strHours = (hours < 10) ? "0" + hours : Integer.toString(hours);
        String strMinutes = (minutes < 10) ? "0" + minutes : Integer.toString(minutes);
        String strSeconds = (seconds < 10) ? "0" + seconds : Integer.toString(seconds);
        return strHours + ":" + strMinutes + ":" + strSeconds;
    }
}
