package ru.astondevs.lesson12_testng;

import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(getFactorial2(5));
    }


    // Рекурсивное решение
    public static int getFactorial2(int f) {
        if (f <= 1) {
            return 1;
        } else {
            return IntStream.rangeClosed(2, f).reduce((x, y) -> x * y).getAsInt();
        }
    }
}
