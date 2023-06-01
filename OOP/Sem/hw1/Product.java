package Sem.hw1;

import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;
    private int calories;

    public Product(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }
}

class VendingMachine {
    private List<Product> products;

    public VendingMachine() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product sellProduct(int index) {
        if (index >= 0 && index < products.size()) {
            return products.remove(index);
        } else {
            System.out.println("Неверный индекс продукта");
            return null;
        }
    }
}
