package Sem.hw4;

import java.util.ArrayList;

public class Box<T extends Fruit> implements Comparable<Box<T>> {
    protected ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0.0f;
        }

        float weight = 0.0f;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> anotherBox) {
        return Math.abs(getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    public void transferFruitsTo(Box<T> anotherBox) {
        if (this == anotherBox) {
            return;
        }

        if (!this.getClass().equals(anotherBox.getClass())) {
            System.out.println("Нельзя пересыпать фрукты разных типов коробок");
            return;
        }

        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

    @Override
    public boolean compare(Box<T> o, Box<T> o2) {
        return Float.compare(o.getWeight(), o2.getWeight()) == 0;
    }

}
