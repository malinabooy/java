package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Manager implements Observer {
    private static Random random = new Random();
    private String name;
    private double minSalary;

    public Manager(String name) {
        this.name = name;
        minSalary = random.nextDouble(80000, 100000);
    }

    @Override
    public void receiveOffer(String companyName, double salary) {
        if (minSalary <= salary) {
            System.out.printf("Менеджер %s (%f) >>> Мне нужна эта работа! (%s - %f)\n",
                    name, minSalary, companyName, salary);
            minSalary = salary;
        } else {
            System.out.printf("Менеджер %s (%f) >>> Я найду работу получше! (%s - %f)\n",
                    name, minSalary, companyName, salary);
        }
    }

}
