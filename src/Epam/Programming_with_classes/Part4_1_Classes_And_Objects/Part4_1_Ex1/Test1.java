package Epam.Programming_with_classes.Part4_1_Classes_And_Objects.Part4_1_Ex1;

/*
Create class Test1 with two variables.
1) Add a display method and methods for modifying these variables.
2) Add a method that finds the sum of the values of these variables,
3) and a method that finds the largest value of these two variables.
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
