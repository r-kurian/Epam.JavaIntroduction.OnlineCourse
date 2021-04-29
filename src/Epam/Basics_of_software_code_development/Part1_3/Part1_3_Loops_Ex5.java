package Epam.Basics_of_software_code_development.Part1_3;
/*
In a given series of numbers find the sum of series' elements, whose modulus is greater than or equal
to a given e. The series of numbers is: an = 1 / (2 ^ n + 3 ^ n)
 */

/*
Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид: an=1/(2^n+3^n)
 */

public class Part1_3_Loops_Ex5 {

    public static void main(String[] args) {
        int rowLength = 2;
        double e = 0.83;
        double sum = 0;
        for (int i = 1; i <= rowLength; i++) {
            double a = (1 / Math.pow(2, i) + 1 / Math.pow(3, i));
            if (a >= Math.abs(e)) {
                sum += a;
                System.out.println("n = " + i);
            }
            System.out.println("a = " + a);
        }
        System.out.println("result " + sum);
    }
}

/* Пояснение логики из форумов:
"Точность e - обычно это вещественное число, меньше единицы.
Например, 0,01 или 0,0001 или 0,00025.
Решение под собой подразумевает перебор каждого из элементов ряда (массива) до тех пор,
пока элемент больше или равен e. Ну, разумеется, перебор с суммированием.
Соответственно, при точности 0,1 потребуется просуммировать три элемента ряда
(0,833333333, 0,361111111 и 0,162037037), потому как четвертый элемент ряда (0,074845679) будет меньше точности e.
При e равном 0,01 необходимо суммирование первых шести элементов (последний суммируемый элемент - это 0,016996742),
потому как a7=0,008269747 уже меньше точности. Слово МОДУЛЬ просто указано для того,
что ряд (другой, при изменении задания) может содержать как положительные,
так и отрицательные значения. Например, последовательность a_n=((-1)^n)*(1/2^n).
В ней будет чередование отрицательных и положительных элементов."
 */