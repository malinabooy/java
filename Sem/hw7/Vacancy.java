package Sem.hw7;

import java.util.Random;

public class Vacancy {
    private static Random random = new Random();
    private String title;
    private VacancyType type;

    public Vacancy(String title, VacancyType type) {
        this.title = title;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public VacancyType getType() {
        return type;
    }

    public double getSalary() {
        double salary = random.nextDouble(2500, 150000);
        return salary;
    }

    public void sendVacancy(Vacancy vacancy) {
        vacancy.sendOffer(); // Отправляем предложение вакансии в агентство
    }

    public void sendOffer() {
        System.out.printf("Предлагаем вам вакансию: %s, с зарплатой: %.2f%n", getTitle(), getSalary());
    }
}
