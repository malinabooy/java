package Sem.sem1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Product product1 = new Product();

        Product product2 = new Product("ki", "qw", 10);

        System.out.println(product1.displayInfo());
        System.out.println(product2.displayInfo());

        BottleOfWater bottleOfWater = new BottleOfWater("null", "null", 20.4, 20.7);
        System.out.println(bottleOfWater.displayInfo());

        Product bottleOfMilk = new BottleOfMilk("asdasda", "sdasda", 20.5, 20.6, 20.3);
        System.out.println(bottleOfMilk.displayInfo());

        List<Product> products = new ArrayList<Product>();
        products.add(bottleOfMilk);
        products.add(product1);
        products.add(product2);
        products.add(bottleOfWater);

        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWaterResault = vendingMachine.getBottleOfWater(20.7);
        if (bottleOfWaterResault != null) {
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterResault.displayInfo());
        }
        else{
            System.out.println("нет такой ");
        }

    }
}
