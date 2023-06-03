package Sem.sem2;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Персик", "Рыжий");
        //((Animal)cat1).jump();
        cat1.jump();
        cat1.voice();
        Dog dog1 = new Dog("Шарик",8);
        dog1.jump();
        dog1.voice();

        List<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(dog1);

        processAnimals(animals);
    }

    public static void processAnimals(List<Animal> animals){
        for(Animal animal : animals){
            animal.voice();
            if(animal instanceof Cat)
                System.out.println(((Cat)animal).getColor());
        }
    }
}

class Dog extends Animal{
    private int weigth;
    private int getWeigth(){
        return weigth;
    }
    public void setWeigth(int weigth){
        this.weigth = weigth;

}
class Cat extends Animal{
        String color;

}
abstract class Animal{
        private String name;

    public String getName() {
        return name;
    }
}

    public void jump(){
        System.out.println("бубу");
    }
}