package Epam.Programming_with_classes.Part4_1_Classes_And_Objects.Part4_1_Ex3;

/*
Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.

Create a class named Student, that contains the following fields:
first and last name, group number, marks (an array of five elements).
Create an array of 10 elements of this type.
Add the option to display the names and numbers of groups of students with marks of only 9 or 10.
*/

import java.util.Random;

public class StudentMain {

    public static Student[] array = new Student[10];

    // creates students' initials
    public static String getInitials() {
        Random randomInitials = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            char tmp = (char) ('A' + randomInitials.nextInt('Z' - 'A')); // Generate a letter between A and Z
            sb.append(tmp); // Add it to the String
        }
        return sb.toString();
    }

    // creates lastnames
    private static String[] Beginning = {"Petr", "Ivan", "Fedor", "Mikhail", "Stepan", "Pop", "Vasil", "Sokol"};
    private static String[] End = {"ov", "ova", "enko", "idze"};

    public static String getLastName() {
        Random randomizedLastName = new Random();
        return Beginning[randomizedLastName.nextInt(Beginning.length)] +
                End[randomizedLastName.nextInt(End.length)];

    }

    // creates a group number (1,2 or 3)
    public static int getRandomNumberOfGroup() {
        int randomNumberOfGroup = 0;
        for (int i = 0; i < 5; ++i)
            randomNumberOfGroup = (int) (1 + Math.random() * 3); // from 1 to 3
        return randomNumberOfGroup;
    }

    // creates marks for students (5 marks, from 8 to 10)
    public static int[] getRandomMarks() {
        int[] randomizedMarks = new int[5];
        for (int i = 0; i < 5; ++i)
            randomizedMarks[i] = (int) (8 + Math.random() * 3); // from 8 to 10
        return randomizedMarks;
    }

    public static void printAllStudents() {
        for (Student student : array)
            System.out.println(student.toString());
    }

    public static void printAllExcellentStudents() {
        int tmp = 0;
        for (Student student : array) {
            if (student.isExcellentStudent()) {
                System.out.println(student.getInitialsOfStudent() + ", " + getLastName() + ". Group-No: " + student.getNum());
                ++tmp;
            }
        }
        if (tmp == 0)
            System.out.println("No such students!");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            array[i] = new Student(getInitials(), getLastName(), getRandomNumberOfGroup(), getRandomMarks());
        }
        System.out.println("All Students:");
        printAllStudents();

        System.out.println("\nExcellent students:");
        printAllExcellentStudents();
    }
}
