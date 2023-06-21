package Sem.hw7;

import java.util.Random;

public class Company {

    private static Random random = new Random();
    private String nameCompany;
    private double maxSalary;

    private Publisher jobAgency;

    public String getNameCompany() {
        return nameCompany;
    }

    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    public void needEmployee() {
        double salary = random.nextDouble(2500, 150000);
        jobAgency.sendOffer(nameCompany, salary);
    }

}
