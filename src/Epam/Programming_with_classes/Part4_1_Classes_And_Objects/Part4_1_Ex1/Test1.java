package Epam.Programming_with_classes.Part4_1_Classes_And_Objects.Part4_1_Ex1;

/*
Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран
и методы изменения этих переменных. Добавьте метод, который находит сумму значений
этих переменных, и метод, который находит наибольшее значение из этих двух переменных.

Create class Test1 with two variables. Add a display method and methods
for modifying these variables. Add a method that finds the sum of the values
of these variables, and a method that finds the largest value of these two variables.
*/

public class Test1 {

    private int var1;
    private int var2;

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    public void printVars() {
        System.out.println("First variable = " + var1 + ", second variable = " + var2);
    }

    public int sumOfVars() {
        return var1 + var2;
    }

    public int returnMax() {
        return Math.max(var1, var2);
    }
}
