package Epam.Algorithmization.Part2_2;

/*
 * Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк,
 * в которых число 5 встречается три и более раз.
 *
 * The program fills a 10x20 matrix with random numbers from 0 to 15.
 * Then it displays the matrix and the index of the rows in which the number 5 occurs 3 or more times.
 */


public class Part2_2_Matrix_Ex11 {

    public static void printMatrix(int[][] matrix, int numOfRow, int numOfColumns) {
        for (int i = 0; i < numOfRow; i++) {
            for (int j = 0; j < numOfColumns; j++)
                System.out.print(matrix[i][j] + "  ");
            System.out.println();
        }
    }

    public static void randomizeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 16); // [0-15]
            }
        }
    }

    public static void findRowWithNumber5MoreThen3TimesOccur(int[][] matrix, int numOfColumns) {
        for (int i = 0; i < matrix.length; i++) {
            int countFive = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    countFive++;
                }
            }
            if (countFive >= 3) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int numOfRow = 10, numOfColumns = 20;
        int[][] matrix = new int[numOfRow][numOfColumns];
        System.out.println("\nYour randomized square matrix filled by numbers from 0 to 15:");

        randomizeMatrix(matrix);

        printMatrix(matrix, numOfRow, numOfColumns);

        System.out.println("\nIndex of the rows in which the number 5 occurs 3 or more times:");
        findRowWithNumber5MoreThen3TimesOccur(matrix, numOfColumns);
    }
}
