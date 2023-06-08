package Sem.hw3;

public class CustomEmployee extends Employee {


    public CustomEmployee(String name, String surname, int age, double salary) {
        super(name, surname, age, salary);

    }

    @Override
    public double calculateSalary() {
        return 6 * salary; 
    }

    @Override
    public String toString() {
        return String.format("%s %s; Менеджер; Возраст %d; Среднемесячная заработная плата: %.2f (руб.)",
                getSurname(), getName(), getAge(), calculateSalary());
    }
}
