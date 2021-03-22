package Epam.Programming_with_classes.Part4_1_Classes_And_Objects.Part4_1_Ex2;

/*
Create class Test2 with two variables.
1) Add a constructor with input parameters.
2) Add a constructor that initializes the default class members.
3) Add set- and get- methods for the fields of the class instance.
*/

public class Test2 {

    private int var1;
    private int var2;

    public int getVar1() {
        return var1;
    }

    public int getVar2() {
        return var2;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }
}
