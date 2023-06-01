package Sem.sem1;

public class Program {
    public static void main(String[] args) {
        Product product1 = new Product();


        Product product2 = new Product("ki", "qw", 10);

       System.out.println(product1.displayInfo());
       System.out.println(product2.displayInfo());
    }
}
