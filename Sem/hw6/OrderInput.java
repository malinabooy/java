package Sem.hw6;

import java.util.Scanner;

public class OrderInput {
    private Scanner scanner;

    public OrderInput() {
        scanner = new Scanner(System.in);
    }


    public Order createOrderFromInput() {
        String clientName = prompt("Имя клиента: ");
        String product = prompt("Продукт: ");
        int quantity = Integer.parseInt(prompt("Кол-во: "));
        int price = Integer.parseInt(prompt("Цена: "));
        return new Order(clientName, product, quantity, price);
    }

    private String prompt(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}