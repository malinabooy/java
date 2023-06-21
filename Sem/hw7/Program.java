package Sem.hw7;

public class Program {

    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     * добавить новый тип соискателя.
     * **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     * **.3 Предусмотреть тип вакансии (enum)
     * 
     * @param args
     */
    public static void main(String[] args) {
        JobAgency jobAgency = new JobAgency();

        Student student1 = new Student("A");
        Object student2 = new Student("B");

        Master ivanov = new Master("Ivanov");
        Master petrov = new Master("Petrov");

        // Задача 1: Добавление нового типа соискателя
        Intern intern1 = new Intern("Intern1");
        Intern intern2 = new Intern("Intern2");
        Manager manager1 = new Manager("Manager1");
        Manager manager2 = new Manager("Manager2");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver((Observer) student2);
        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(intern1);
        jobAgency.registerObserver(intern2);
        jobAgency.registerObserver(manager1);
        jobAgency.registerObserver(manager2);

        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);

        // Задача 2: Добавление новой сущности "Вакансия"
        Vacancy internVacancy = new Vacancy("Стажер", VacancyType.INTERN);
        Vacancy developerVacancy = new Vacancy("Разработчик", VacancyType.DEVELOPER);
        Vacancy managerVacancy = new Vacancy("Менеджер", VacancyType.MANAGER);

        sendVacancyAndReceiveResponse(geekBrains, internVacancy);
        sendVacancyAndReceiveResponse(geekBrains, developerVacancy);
        sendVacancyAndReceiveResponse(geekBrains, managerVacancy);
        sendVacancyAndReceiveResponse(google, internVacancy);
        sendVacancyAndReceiveResponse(google, developerVacancy);
        sendVacancyAndReceiveResponse(google, managerVacancy);
        sendVacancyAndReceiveResponse(yandex, internVacancy);
        sendVacancyAndReceiveResponse(yandex, developerVacancy);
        sendVacancyAndReceiveResponse(yandex, managerVacancy);
    }

    private static void sendVacancyAndReceiveResponse(Company company, Vacancy vacancy) {
        System.out.printf("Отправляем вакансию от компании %s: %s%n", company.getNameCompany(), vacancy.getTitle());
        vacancy.sendVacancy(vacancy);

        System.out.println("Ответы соискателей:");
        company.needEmployee();
        System.out.println("----------------------------------------");
    }
}
