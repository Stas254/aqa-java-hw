package ru.astondevs.lesson2;

public class Homwork2 {
    public static void main(String[] args) {
        System.out.println("______---1---_______");
        printThreeWords();
        System.out.println("______---2---_______");
        checkSumSign();
        System.out.println("______---3---_______");
        printColor();
        System.out.println("______---4---_______");
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    static void checkSumSign() {
        int a = 10;
        int b = 5;
        System.out.println("а = " + a + ", b = " + b);
        if (a + b >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    static void printColor() {
        int value = 101;
        if (value <= 0)
            System.out.println("Красный");
        else if (value <= 100)
            System.out.println("Желтый");
        else
            System.out.println("Зеленый");

/* //Вариант 2-й
        int value = 101;
        if (value <= 0)
            System.out.println("Красный");
        else if (value > 0 && value <= 100)
            System.out.println("Желтый");
        else
            System.out.println("Зеленый");
*/
    }

    static void compareNumbers() {
        int a = -1;
        int b = 0;
        System.out.println("а = " + a + ", b = " + b);
        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }
}
