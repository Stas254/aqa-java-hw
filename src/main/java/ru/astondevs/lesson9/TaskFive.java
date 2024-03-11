package ru.astondevs.lesson9;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        ArrayList<String> logins = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Для продолжения введите логин. Для завершения ничего не вводите, и нажмите ENTER.");
            String login = scanner.nextLine();
            if (login.isEmpty()) {
                break;
            }
            logins.add(login);
        }
        logins.stream()
                .filter(login -> login.startsWith("f"))
                .forEach(System.out::println);
    }
}
