package Sem.sem1;

public class BottleOfMilk extends Product{
    private double volume;
    private double fatContent;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getFatContent() {
        return fatContent;
    }

    public BottleOfMilk(String brand, String name, double price, double volume, double fatContent) {
        super(brand, name, price);
        this.volume = volume;
        this.fatContent = fatContent;
    }

    @Override
    public String displayInfo(){
        return String.format("%s - %s - %f - %f - %f", brand, name, price, volume, fatContent);
    }
}
