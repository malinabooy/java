package ru.geekbrains.lesson6.srp2;

public class Program {


    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {
        OrderInput orderInput = new OrderInput();
        Order order = orderInput.createOrderFromInput();
        order.saveToJson();

    }

}
