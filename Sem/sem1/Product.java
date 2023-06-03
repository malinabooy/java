package Sem.sem1;

public class Product {

    protected String name;
    protected String brand;

    protected double price;

    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    public Product(){
        brand = "noname";
        name = "product";
        price = 100;
    }

    public Product(String inputName, double inputPrice){
        brand = "noname";
        name = inputName;
        price = inputPrice;
    }

    public Product(String inputBrand, String inputName, double inputPrice){
        if(inputBrand == null || inputBrand.length() < 4){
            brand = "noname";
        }
        else{
            brand = inputBrand;
        }
        
        name = inputName;
        price = inputPrice;

    }

    public String displayInfo(){
        return String.format("%s - %s - %f", brand, name, price);
    }
}
