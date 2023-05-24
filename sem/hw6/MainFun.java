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
        filters.put(1, 8); // ОЗУ: минимальное значение 8 GB
        filters.put(3, "Windows 10"); // Операционная система: Windows 10
        filters.put(2, 256); // Память ЖД: минимальное значение 8 GB

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
