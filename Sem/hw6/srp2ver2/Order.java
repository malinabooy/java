package Sem.hw6.srp2ver2;

public class Order implements JsonSerializable {
    private String clientName;
    private String product;
    private int quantity;
    private double price;

    public Order(String clientName, String product, int quantity, double price) {
        this.clientName = clientName;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    @Override
    public String toJson() {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{\n");
        jsonBuilder.append("\"Имя клиента\":\"").append(clientName).append("\",\n");
        jsonBuilder.append("\"Продукт\":\"").append(product).append("\",\n");
        jsonBuilder.append("\"Кол-во\":").append(quantity).append(",\n");
        jsonBuilder.append("\"Цена\":").append(price).append("\n");
        jsonBuilder.append("}\n");
        return jsonBuilder.toString();
    }
}
