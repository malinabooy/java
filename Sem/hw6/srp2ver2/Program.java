package ru.geekbrains.lesson6.srp2.srp2ver2;

public class Program {
    public static void main(String[] args) {
        ConsoleOrderInput consoleOrderInput = new ConsoleOrderInput();
        Order order = consoleOrderInput.createOrderFromConsoleInput();
        JsonFileWriter jsonFileWriter = new JsonFileWriter();
        jsonFileWriter.writeJsonToFile(order, "orderVer2.json");
    }
}

