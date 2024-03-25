package ru.astondevs.lesson12_junit;

import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(getFactorial(5));
     //   System.out.println(getFactorial2(5));
    }

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
        // Рекурсивное решение
    /*  public static int getFactorial2(int f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return IntStream.rangeClosed(2, f).reduce((x, y) -> x * y).getAsInt();
        }
      }
    */
}
