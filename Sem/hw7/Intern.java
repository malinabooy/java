package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Intern implements Observer {
    private static Random random = new Random();
    private String name;
    private double maxSalary;

    public Intern(String name) {
        this.name = name;
        maxSalary = random.nextDouble(30000, 50000);
    }

    @Override
    public void receiveOffer(String companyName, double salary) {
        if (salary >= maxSalary) {
            System.out.printf("Студент %s (%f) >>> Я согласен на эту вакансию! (%s - %f)\n",
                    name, maxSalary, companyName, salary);
            maxSalary = salary;
        } else {
            System.out.printf("Студент %s (%f) >>> Я жду лучшего предложения! (%s - %f)\n",
                    name, maxSalary, companyName, salary);
        }
    }
}
