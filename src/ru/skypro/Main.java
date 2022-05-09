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

        double max = member[0].getSalary();
        for (int i = 0; i < member.length; i++) {
            if (max > member[i].getSalary()) {
                max = member[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата в компании: " + max);
        System.out.println();

        double min = member[0].getSalary();
        for (int i = 0; i < member.length; i++) {
            if (min < member[i].getSalary()) {
                min = member[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата в компании: " + min);
        System.out.println();

        for (int i = 0; i < member.length; i++) {
            System.out.println(member[i].getFirstName() + " " + member[i].getSecondName() + " " + member[i].getThirdName());
        }

        //повышенная сложность

        System.out.println();
        System.out.println("Повышенная сложность");
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Отдел " + i);
            double maxi = 0;
            double mini = 1000000;
            double summa = 0;
            double percent = 20;
            for (int j = 0; j < member.length; j++) {
                if (member[j].getDepart() == i) {
                    if (member[j].getSalary() > maxi) {
                        maxi = member[j].getSalary();
                    }
                    if (member[j].getSalary() < mini) {
                        mini = member[j].getSalary();
                    }
                    summa = summa + member[j].getSalary();
                    System.out.println("Сотрудник отдела: " + member[j].getFirstName() + " " + member[j].getSecondName() + " " + member[j].getThirdName() + ", " + member[j].getSalary());
                    member[j].setSalary(member[j].getSalary() + member[j].getSalary() / 100 * percent);
                    System.out.println("Проиндексированная зарплата в отделе = " + member[j].getSalary());
                    //Чтобы увидеть сразу проиндексироанную зп, можно sout по сотрудникам перенести под операцию индексации зп
                }

            }
            System.out.println("Максимальная зарплата в отделе = " + maxi);
            System.out.println("Минимальная зарплата в отделе = " + mini);
            System.out.println("Затраты на зарплату в отделе = " + summa);
            System.out.println();

        }
        double normal = 260000;
        for (int i = 0; i < member.length; i++) {
            if (member[i].getSalary() < normal) {
                System.out.println("Зарплата < нормы у сотрудника с ID " + member[i].getId() + ": " + member[i].getFirstName() + " " + member[i].getSecondName() + " " + member[i].getThirdName() + ", " + member[i].getSalary());
            } else {
                System.out.println("Зарплата >= норме у сотрудника с ID " +member[i].getId() + " " + member[i].getFirstName() + " " + member[i].getSecondName() + " " + member[i].getThirdName() + ", " + member[i].getSalary());
            }
            //я тут сделала, что ID по порядку проверяются, но могу и так, чтобы сначала больше, потом меньше, просто else поменять на еще один if
        }


    }
}
