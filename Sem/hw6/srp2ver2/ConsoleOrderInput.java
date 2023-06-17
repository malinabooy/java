package ru.geekbrains.lesson6.srp2.srp2ver2;

import java.util.Scanner;

public class ConsoleOrderInput {
    private Scanner scanner;

    public ConsoleOrderInput() {
        scanner = new Scanner(System.in);
    }

    public Order createOrderFromConsoleInput() {
        String clientName = prompt("Имя клиента: ");
        String product = prompt("Продукт: ");
        int quantity = Integer.parseInt(prompt("Кол-во: "));
        double price = Double.parseDouble(prompt("Цена: "));
        return new Order(clientName, product, quantity, price);
    }

    private String prompt(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}
