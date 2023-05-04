package sem.hw5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
public class telefon {
    public static void main(String[] args) {
        Map<String, List<String>> abonent = new HashMap<>();
        choice(abonent);
    }

    private static String fio() { //Ввод ФИО
        Scanner scanner = new Scanner(System.in, "866");
        System.out.printf("Введите ФИО абонента: ");
        scanner.close();
        return scanner.nextLine();
    }

    private static List<String> numberList() { //Ввод номеров
        List<String> listOfNumbers = new LinkedList<>();
        Scanner scanner = new Scanner(System.in, "866");
        System.out.println("Введите номера телефонов через пробел: ");
        String[] numbers = scanner.nextLine().split(" ");
        Collections.addAll(listOfNumbers, numbers);
        scanner.close();
        return listOfNumbers;
    }

    //Добавление абонента
    public static void addAbonent(Map<String, List<String>> abonent, String fileName) {
        String fioStr = fio();
        List<String> listOfNumbers = numberList();
        if (abonent.containsKey(fioStr)) {
            abonent.get(fioStr).addAll(listOfNumbers);
        } else {
            abonent.put(fioStr, listOfNumbers);
        }
        System.out.println(abonent);

        try {
            FileWriter writer = new FileWriter("sem/hw5/files/phoneBook.txt", true);
            writer.write(fioStr + ": " + listOfNumbers + "\n");
            writer.close();
            System.out.println("Данные успешно записаны в файл " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи данных в файл " + fileName + ": " + e.getMessage());
        }
    }

    //Поиск абонента
    public static void searchAbonent(Map<String, List<String>> abonent, String fileName) {
        Scanner scanner = new Scanner(System.in, "866");
        System.out.printf("Введите ФИО или номер телефона абонента: ");
        String input = scanner.nextLine();
        boolean found = false;
        for (Map.Entry<String, List<String>> entry : abonent.entrySet()) {
            if (entry.getKey().equals(input) || entry.getValue().contains(input)) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Абонент с ФИО или номером телефона " + input + " не найден.");
        }
        scanner.close();
    }


    //Удаление абонента
    public static void deleteAbonent(Map<String, List<String>> abonent, String fileName) {
        String fioStr = fio();
        if (abonent.containsKey(fioStr)) {
            abonent.remove(fioStr);
            System.out.println("Абонент " + fioStr + " удален.");
            try {
                PrintWriter writer = new PrintWriter("sem/hw5/files/phoneBook.txt");
                writer.close();
                FileWriter newWriter = new FileWriter("sem/hw5/files/phoneBook.txt", true);
                for (Map.Entry<String, List<String>> entry : abonent.entrySet()) {
                    newWriter.write(entry.getKey() + ": " + entry.getValue() + "\n");
                }
                newWriter.close();
                System.out.println("Данные успешно записаны в файл " + fileName);
            } catch (IOException e) {
                System.out.println("Ошибка при записи данных в файл " + fileName + ": " + e.getMessage());
            }
        } else {
            System.out.println("Абонент " + fioStr + " не найден.");
        }
    }

    //Выбор действий
    public static void choice(Map<String, List<String>> abonent) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить абонента");
            System.out.println("2. Удалить абонента");
            System.out.println("3. Найти и вывести абонентов по ключу");
            System.out.println("4. Выйти");

            choice = scanner.nextInt();
            scanner.nextLine(); // считываем символ перевода строки после ввода числа

            switch (choice) {
                case 1:
                    addAbonent(abonent, "sem/hw5/files/phoneBook.txt");
                    break;
                case 2:
                    deleteAbonent(abonent, "sem/hw5/files/phoneBook.txt");;
                    break;
                case 3:
                    searchAbonent(abonent, "sem/hw5/files/phoneBook.txt");
                    break;
                case 4:
                    System.out.println("Завершение работы.");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        } while (choice != 4);
        scanner.close();
    }
}