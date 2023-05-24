package sem.hw6;

import java.util.*;

public class MainFun {
    public static void main(String[] args) {
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("Lenovo ThinkPad", 8, 256, "Windows 10", "Black"));
        notebooks.add(new Notebook("HP Pavilion", 16, 512, "Windows 10", "Silver"));
        notebooks.add(new Notebook("Apple MacBook Pro", 16, 512, "macOS", "Space Gray"));
        notebooks.add(new Notebook("Dell XPS 13", 8, 256, "Windows 10", "Rose Gold"));
        notebooks.add(new Notebook("Acer Aspire", 12, 512, "Linux", "Blue"));
        notebooks.add(new Notebook("Lenovo Yoga", 16, 1024, "Windows 11", "Silver"));
        notebooks.add(new Notebook("HP Envy", 8, 256, "Windows 10", "Black"));
        notebooks.add(new Notebook("Dell Inspiron", 16, 512, "Windows 11", "Rose Gold"));
        notebooks.add(new Notebook("Apple MacBook Air", 8, 256, "macOS", "Gold"));
        notebooks.add(new Notebook("Asus ROG Strix", 32, 1024, "Linux", "Black"));

        Map<Integer, Object> filters = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        int criterion;
        do {
            System.out.print("Введите цифру, соответствующую необходимому критерию:\n" +
                    "1 - ОЗУ\n" +
                    "2 - Объём ЖД\n" +
                    "3 - Операционная система\n" +
                    "4 - Цвет\n" +
                    "0 - Завершить ввод и выполнить фильтрацию\n");

            criterion = scanner.nextInt();

            switch (criterion) {
                case 1:
                    System.out.print("Введите минимальное значение ОЗУ (в GB): ");
                    int minRam = scanner.nextInt();
                    filters.put(1, minRam);
                    break;
                case 2:
                    System.out.print("Введите минимальное значение объёма ЖД (в GB): ");
                    int minStorage = scanner.nextInt();
                    filters.put(2, minStorage);
                    break;
                case 3:
                    System.out.print("Введите операционную систему: ");
                    String os = scanner.next();
                    filters.put(3, os);
                    break;
                case 4:
                    System.out.print("Введите цвет: ");
                    String color = scanner.next();
                    filters.put(4, color);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Некорректный выбор критерия.");
                    break;
            }
        } while (criterion != 0);

        scanner.close();

        List<Notebook> filteredNotebooks = Notebook.filterNotebooks(notebooks, filters);

        for (Notebook notebook : filteredNotebooks) {
            System.out.println("Model: " + notebook.getModel());
            System.out.println("RAM: " + notebook.getRam() + " GB");
            System.out.println("Storage: " + notebook.getStorage() + " GB");
            System.out.println("Operating System: " + notebook.getOperatingSystem());
            System.out.println("Color: " + notebook.getColor());
            System.out.println("--------------------");
        }
    }
}
