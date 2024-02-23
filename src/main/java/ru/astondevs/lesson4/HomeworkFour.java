package ru.astondevs.lesson4;

public class HomeworkFour {
    public static void main(String[] args) {
        System.out.println("______---1---_______");
        Employee employee = new Employee("Александрова Ирина", "Учитель", "alekstut@yandex.ru", "8-033-597-78-65", 1000.45, 52);
        employee.employeePrint();
        System.out.println("______---2---_______");
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Ivan", "Engineer", "II@mail.ru", "892132587", 30000, 25);
        empArray[1] = new Employee("Petrov Petr", "Engineer 2 сat", "PP@mail.ru", "8924587", 35000, 30);
        empArray[2] = new Employee("Sidorov Serg", "Engineer 1 сat", "SS@mail.ru", "789872587", 40000, 35);
        empArray[3] = new Employee("Lis Ivan", "Lead Engineer", "LI@mail.ru", "89546557", 45000, 40);
        empArray[4] = new Employee("Luzan Ket", "Technologist", "LK@mail.ru", "86546545", 28000, 25);
        for (int i = 0; i < empArray.length; i++)
            System.out.println(empArray[i]);

        // Смотри class MainPark для задания №3
        // System.out.println("______---3---_______");


    }
}