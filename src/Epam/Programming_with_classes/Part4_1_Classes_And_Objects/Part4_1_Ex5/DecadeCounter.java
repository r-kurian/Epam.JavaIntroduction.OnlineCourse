package Epam.Programming_with_classes.Part4_1_Classes_And_Objects.Part4_1_Ex5;

/*
Write a decimal counter class that can increment or decrement its value by one within a specified range.

Initialize the counter with default values and random values.

The counter has methods for increasing and decreasing state,
and a method for getting its current state.
*/

public class DecadeCounter {
/* Класс счетчика будет содержать поля: минимальное, максимальное и текущее значения.
При этом, стоит обработать следующие случаи:

при инкременте текущее значение стало больше максимального – сделаем его равным минимальному;
при декременте текущее значение стало меньше минимального – сделаем его равным максимальному;
в конструктор передано минимальное значение больше максимального – поменяем их местами;
в конструктор передано текущее значение больше максимального – сделаем его равным максимальному;
к конструктор передано текущее значение меньше минимального – сделаем его равным минимальному.

В условии задачи не указано как именно нужно обработать такие ситуации – реализация выбрана «на свое усмотрение».
*/

    private int min, max, current;

    public DecadeCounter (int min, int max) {
        this.min = min;
        this.max = max;
        current = (min - max) / 2; // default value
    }

    public DecadeCounter (int min, int max, int current) {
        this.min = min;
        this.max = max;
        this.current = current;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getCurrent() {
        return current;
    }

    public void incCurrent() {
        if (current < max)
            ++current;
    }

    public void decCurrent() {
        if (current > min)
            --current;
    }

}
