package sem.hw6;

import java.util.*;

public class Notebook {
    private String model;
    private int ram;
    private int storage;
    private String operatingSystem;
    private String color;

    public Notebook(String model, int ram, int storage, String operatingSystem, String color) {
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    // Метод для фильтрации ноутбуков по заданным критериям
    public static List<Notebook> filterNotebooks(List<Notebook> notebooks, Map<Integer, Object> filters) {
        List<Notebook> filteredNotebooks = new ArrayList<>();

        for (Notebook notebook : notebooks) {
            boolean meetsCriteria = true;

            // Проверка каждого критерия фильтрации
            for (Map.Entry<Integer, Object> entry : filters.entrySet()) {
                int criterion = entry.getKey();
                Object value = entry.getValue();

                switch (criterion) {
                    case 1: // ОЗУ
                        int minRam = (int) value;
                        if (notebook.getRam() < minRam) {
                            meetsCriteria = false;
                        }
                        break;
                    case 2: // Объём ЖД
                        int minStorage = (int) value;
                        if (notebook.getStorage() < minStorage) {
                            meetsCriteria = false;
                        }
                        break;
                    case 3: // Операционная система
                        String os = (String) value;
                        if (!notebook.getOperatingSystem().equalsIgnoreCase(os)) {
                            meetsCriteria = false;
                        }
                        break;
                    case 4: // Цвет
                        String color = (String) value;
                        if (!notebook.getColor().equalsIgnoreCase(color)) {
                            meetsCriteria = false;
                        }
                        break;
                    // Добавьте дополнительные критерии, если необходимо
                }
                
                if (!meetsCriteria) {
                    break; // Прерываем проверку остальных критериев, если уже не соответствует
                }
            }
            
            if (meetsCriteria) {
                filteredNotebooks.add(notebook);
            }
        }

        return filteredNotebooks;
    }
}
