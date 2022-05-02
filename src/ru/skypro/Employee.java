package ru.skypro;

public class Employee {
    private String firstName;
    private String secondName;
    private String thirdName;
    private int depart;
    private double salary;
    private int id = 1;

    public static int COUNT = 0;

    public Employee(String firstName, String secondName, String thirdName, int depart, double salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.depart = depart;
        this.salary = salary;
        this.id = ++COUNT;

    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getSecondName() {
        return this.secondName;
    }
    public String getThirdName() {
        return this.thirdName;
    }
    public int getDepart() {
        return this.depart;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString() {
        return "ФИО  " + this.firstName + " " + this.secondName + " " + this.thirdName + ",  отдел " + this.depart + ",  зартплата " + this.salary;
    }

}
