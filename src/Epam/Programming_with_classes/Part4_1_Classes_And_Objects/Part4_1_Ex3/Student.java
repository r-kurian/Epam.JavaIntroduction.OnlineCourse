package Epam.Programming_with_classes.Part4_1_Classes_And_Objects.Part4_1_Ex3;

/*
Create a class named Student, that contains the following fields:
first and last name, group number, marks (an array of five elements).
Create an array of 10 elements of this type.
Add the option to display the names and numbers of groups of students with marks of only 9 or 10.
*/

import java.util.Arrays;

public class Student {
    private String initialsOfStudent;
    private String lastName;
    private int numberOfGroup;
    private int[] marks;

    public Student (String initialsOfStudent, String lastName, int numberOfGroup, int[] marks) {
        this.initialsOfStudent = initialsOfStudent;
        this.lastName = lastName;
        this.numberOfGroup = numberOfGroup;
        this.marks = marks;
    }

    public String getInitialsOfStudent() {
        return initialsOfStudent;
    }

    public int getNum() {
        return numberOfGroup;
    }

    public boolean isExcellentStudent() {
        int tmp = 0;
        for (int i : marks) {
            if (i >= 9)
                ++tmp;
        }
        return tmp == 5;
    }

    @Override
    public String toString() {
        return "" + initialsOfStudent +
                ", " + lastName +
                ", Group-No: " + numberOfGroup +
                ", Marks: " + Arrays.toString(marks);
    }
}

