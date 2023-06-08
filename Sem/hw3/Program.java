package Sem.hw3;

import java.util.Arrays;
import java.util.Random;



public class Program {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     *
     * @return
     */
    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int age = random.nextInt(20, 45);
        int salary = random.nextInt(20000, 80000);
        int employeeType = random.nextInt(3); // Генерируем случайное число от 0 до 1
    
        if (employeeType == 0) {
            return new Worker(names[random.nextInt(10)], surnames[random.nextInt(10)], age, salary);
        }
        if(employeeType == 1) {
            return new Freelancer(names[random.nextInt(10)], surnames[random.nextInt(10)], age, salary);
        }
        else {
            return new CustomEmployee(names[random.nextInt(10)], surnames[random.nextInt(10)], age, salary);
        }
    }

        //return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(3)], salary);



    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *  Придумать несколько Comparator'ов для сортировки сотрудников
     *  по фамилии + имени или по возрасту и уровню ЗП.
     * @param args
     */
    public static void main(String[] args) {


        Employee[] employees = new Employee[5];
        for (int i = 0; i < employees.length; i++){
            employees[i] = generateEmployee();

        }

        System.out.println("Сортировка по ЗП");
        Arrays.sort(employees, new SalaryComparator()); // new SalaryComparator()
        for(Employee employee : employees){
            System.out.println(employee);
        }

        System.out.println();
        System.out.println("Сортировка по возрасту");
        Arrays.sort(employees, new AgeComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println();
        System.out.println("Сортировка по имени");
        Arrays.sort(employees, new NameComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

}
