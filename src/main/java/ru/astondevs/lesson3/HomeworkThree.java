package ru.astondevs.lesson3;

public class HomeworkThree {
    public static void main(String[] args) {
        System.out.println("______---1---_______");
        System.out.println(taskOne(-11, 31));
        System.out.println("______---2---_______");
        taskTwo(5);
        System.out.println("______---3---_______");
        System.out.println(taskThree(-10));
        System.out.println("______---4---_______");
        taskFour("Привет!", 2);
        System.out.println("______---5---_______");
        System.out.println(taskFive(2023));
        System.out.println("______---6---_______");
        taskSix();
        System.out.println("______---7---_______");
        taskSeven();
        System.out.println("______---8---_______");
        taskEight();
        System.out.println("______---9---_______");
        taskNine();
        System.out.println("______---10---_______");
        taskTen(10, 9);
    }

    public static boolean taskOne(int a, int b) {
        if (a + b > 10 && a + b >= 20)
            return true;
        else
            return false;
    }

    public static void taskTwo(int a) {
        if (a >= 0)
            System.out.println("Число a = " + a + " положительное");
        else
            System.out.println("Число a = " + a + " отрицательное");
    }

    public static boolean taskThree(int a) {
        if (a >= 0)
            return false;
        else
            return true;
    }

    public static void taskFour(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static boolean taskFive(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true; //если год делится на 100 и на 400 одновременно (високосный)
                } else {
                    return false;  //если год делится на 100, но не делится на 400 (обычный)
                }
            } else {
                return true;  //если год делится на 4, но не делится на 100 (високосный)
            }
        } else {
            return false; //если год не делится на 4 (обычный)
        }
    }

    /*    //Второй вариант

        if ( ( ( year % 4 == 0 ) && ( year % 100 != 0 ) ) || ( year % 400 == 0 ))  {
           // System.out.println( "Год " + year + " високосный");
            return true;
        }
        else {
           // System.out.println( "Год " + year + " невисокосный");
            return false;
        }
  }
*/
    public static void taskSix() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный одномерный массив:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("Заменим 0 на 1, 1 на 0:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[i] = 1;
            else if (arr[i] == 1)
                arr[i] = 0;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void taskSeven() {
        int[] mas = new int[100];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i + 1;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    public static void taskEight() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный одномерный массив:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("Умножим числа массива, которые меньше 6-ти, на 2:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void taskNine() {
        int n = 7;
        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1)
                    table[i][j] = 1;
                else
                    table[i][j] = 0;
                System.out.print(table[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void taskTen(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + "  ");
        }
    }
}
