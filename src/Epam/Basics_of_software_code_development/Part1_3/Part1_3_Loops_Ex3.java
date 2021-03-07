package Epam.Basics_of_software_code_development.Part1_3;

// Найти сумму квадратов первых ста чисел

// Find the sum of the squares of the first 100 natural numbers

public class Part1_3_Loops_Ex3 {
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;
        while (n <= 100) {
            n = (n*n);
            n++;
            sum = (sum + n);
        }
        System.out.println("The sum of squares of even numbers from 1 to 100 = " +sum);
    }
}
