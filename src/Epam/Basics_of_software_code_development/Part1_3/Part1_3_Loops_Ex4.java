package Epam.Basics_of_software_code_development.Part1_3;

// Составить программу нахождения произведения квадратов первых двухсот чисел.

import java.math.BigInteger;

public class Part1_3_Loops_Ex4 {
    public static void main(String[] args) {
        BigInteger s = BigInteger.valueOf(1);
        for(int i = 1; i <= 200; i++) {
            s = s.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println(s);
    }
}
