package Epam.Basics_of_software_code_development.Part1_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.

Enter a natural number T, which represents the time in seconds.
Print the given duration value in hours, minutes and seconds in the following form:
ННh MMmin SSs.
*/
public class Part1_1_Linear_Program_Ex5 {
    public static void main(String[] args) {
        try {

            Scanner in = new Scanner(System.in);
            System.out.println("Input the time is seconds:");
            int durationInSeconds = in.nextInt();

            int HH = durationInSeconds % 86400 / 3600;
            int MM = durationInSeconds % 3600 / 60;
            int SS = durationInSeconds % 60;
            System.out.println(HH + "h " + MM + "min " + SS + "sec");

        } catch (InputMismatchException ex) {
            System.out.println("Input error! " + ex.getMessage());
        }
    }
}
