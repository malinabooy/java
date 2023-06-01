package Sem.hw1;

public class Program {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        // Создание и добавление различных продуктов в вендинг-машину
        Product product1 = new Product("Шоколадка 1", 2.5, 200);
        Product product2 = new Product("Шоколадка 2", 3.0, 250);
        Product product3 = new Product("Конфеты", 1.5, 150);
        Product product4 = new Product("Чипсы", 2.0, 300);
        Product product5 = new Product("Газировка", 1.0, 100);

        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);
        vendingMachine.addProduct(product4);
        vendingMachine.addProduct(product5);

        // Продажа товара
        int indexToSell = 2;
        Product soldProduct = vendingMachine.sellProduct(indexToSell); // Продажа третьего продукта (индекс 2)

        if (soldProduct != null) {
            System.out.println("Продан продукт: " + soldProduct.getName());
            System.out.println("Цена: " + soldProduct.getPrice());
            System.out.println("Калории: " + soldProduct.getCalories());
        }
    }
}
