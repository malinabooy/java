package Sem.hw4;

import java.util.ArrayList;
import java.util.Collections;

public class Program {

    /**
     * Домашняя работа, задача:
     * ========================
     * 
     * a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     * b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются
     * по типу фрукта,
     * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     * c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     * d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес
     * одного фрукта и их количество:
     * вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     * e. Внутри класса Box сделать метод compare(), который позволяет сравнить
     * текущую коробку с той, которую
     * подадут в compare() в качестве параметра. true – если их массы равны, false в
     * противоположном случае.
     * Можно сравнивать коробки с яблоками и апельсинами;
     * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в
     * другую.
     * Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с
     * апельсинами.
     * Соответственно, в текущей коробке фруктов не остается, а в другую
     * перекидываются объекты, которые были в первой;
     * g. Не забываем про метод добавления фрукта в коробку.
     */
    public static void main(String[] args) {

        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Вес 1-ой коробки Яблок: " + appleBox1.getWeight());
        System.out.println("Вес 2-ой коробки Яблок: " + appleBox2.getWeight());
        System.out.println("Вес коробки Апельсинов: " + orangeBox.getWeight());


        System.out.println();
        WeightComparator weightComparator = new WeightComparator<>();
        System.out.println("Сравним 1-ую и 2-ую коробки Яблок: ");
        weightComparator.compare(appleBox1, appleBox2);


        System.out.println();
        Box<Apple> appleBox3 = new Box<>();
        appleBox3.addFruit(new Apple());
        appleBox3.addFruit(new Apple());
        appleBox3.addFruit(new Apple());

        System.out.println("Вес 3-ей коробки Яблок до перемещения: " + appleBox3.getWeight());
        System.out.println("Вес 2-ой коробки Яблок до перемещения: " + appleBox2.getWeight());

        appleBox2.transferFruitsTo(appleBox3);
;

        System.out.println();
        System.out.println("Вес 3-ей коробки Яблок после перемещения: " + appleBox3.getWeight());
        System.out.println("Вес 2-ой коробки Яблок после перемещения: " + appleBox2.getWeight());

        System.out.println();
        System.out.println("Сравним коробки Яблок и Апельсинов по весу: ");
        System.out.println(appleBox3.getWeight());
        System.out.println(orangeBox.getWeight());
        weightComparator.compare(appleBox3, orangeBox);
    }
}

