package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Employee[] member = new Employee[10];
        member[0] = new Employee("Титова", "Диана", "Сергеевна", 1, 230000);
        member[1] = new Employee("Иванов", "Михаил", "Викторович", 2, 250000);
        member[2] = new Employee("Нечаева", "Лилия", "Кирилловна", 3, 215000);
        member[3] = new Employee("Грачев", "Денис", "Матвеевич", 4, 145000);
        member[4] = new Employee("Григорьев", "Матвей", "Давидович", 5, 185000);
        member[5] = new Employee("Пугачев", "Владислав", "Эминович", 1, 198000);
        member[6] = new Employee("Тихонов", "Андрей", "Давидович", 2, 220000);
        member[7] = new Employee("Дубровина", "Ольга", "Михайловна", 3, 300000);
        member[8] = new Employee("Королев", "Владимир", "Леонович", 4, 280000);
        member[9] = new Employee("Андреева", "Варвара", "Александровна", 5, 260000);

        for (int i = 0; i < member.length; i++) {
            System.out.println(member[i]);
        }
        System.out.println();

        double summ = 0;
        for (int i = 0; i < member.length; i++) {
         summ = summ + member[i].getSalary();
        }
        System.out.println("Общие затраты на зарплату: " + summ);
        System.out.println();

        summ = summ / member.length;
        System.out.println("Средняя зарплата в компании: " + summ);
        System.out.println();

        double max = 0;
        for (int i = 0; i < member.length; i++) {
            if (max < member[i].getSalary()) {
                max = member[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата в компании: " + max);
        System.out.println();

        double min = 1000000;
        for (int i = 0; i < member.length; i++) {
            if (min > member[i].getSalary()) {
                min = member[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата в компании: " + min);
        System.out.println();

        for (int i = 0; i < member.length; i++) {
            System.out.println(member[i].getFirstName() + " " + member[i].getSecondName() + " " + member[i].getThirdName());
        }


    }
}
