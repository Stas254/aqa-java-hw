package ru.astondevs.lesson4;

public class HomeworkFour {
    public static void main(String[] args) {
        System.out.println("______---1---_______");
        Employee employee = new Employee("Александрова Ирина", "Учитель", "alekstut@yandex.ru", "8-033-597-78-65", 1000.45, 52);
        employee.employeePrint();
        System.out.println("______---2---_______");
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "II@mail.ru", "892132587", 30000, 25);
        persArray[1] = new Person("Petrov Petr", "Engineer 2 сat", "PP@mail.ru", "8924587", 35000, 30);
        persArray[2] = new Person("Sidorov Serg", "Engineer 1 сat", "SS@mail.ru", "789872587", 40000, 35);
        persArray[3] = new Person("Lis Ivan", "Lead Engineer", "LI@mail.ru", "89546557", 45000, 40);
        persArray[4] = new Person("Luzan Ket", "Technologist", "LK@mail.ru", "86546545", 28000, 25);
        for (int i = 0; i < persArray.length; i++)
            System.out.println(persArray[i]);

        // Смотри class MainPark для задания №3
        // System.out.println("______---3---_______");

    }
}