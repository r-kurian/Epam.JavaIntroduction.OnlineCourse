package Epam.Basics_of_software_code_development.Part1_3;

/*
Вывести на экран соответствий между символами
и их численными обозначениями в памяти компьютера (Таблица ASCII).

Converting between characters and numerical (ASCII) values.
*/

import java.util.Scanner;

public class Part1_3_Loops_Ex6 {
    public static void main(String[] args) {
        System.out.println("Write your text to find it char-equivalent according to ASCII table: ");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();

        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i) + " => " + a.codePointAt(i));
        }
    }
}