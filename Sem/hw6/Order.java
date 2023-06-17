package ru.geekbrains.lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;

public class Order {
    private String clientName;
    private String product;
    private int quantity;
    private int price;

    public Order(String clientName, String product, int quantity, int price) {
        this.clientName = clientName;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public void saveToJson() {
        String fileName = "order.json";
        String orderJson = getOrderJson();
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write(orderJson);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private String getOrderJson() {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{\n");
        jsonBuilder.append("\"clientName\":\"").append(clientName).append("\",\n");
        jsonBuilder.append("\"product\":\"").append(product).append("\",\n");
        jsonBuilder.append("\"quantity\":").append(quantity).append(",\n");
        jsonBuilder.append("\"price\":").append(price).append("\n");
        jsonBuilder.append("}\n");
        return jsonBuilder.toString();
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }
}
