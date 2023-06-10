package Sem.hw4;
import java.util.Comparator;

public class WeightComparator<T extends Fruit> implements Comparator<Box<T>> {
        @Override
        public int compare(Box<T> box1, Box<T> box2) {
            float weight1 = box1.getWeight();
            float weight2 = box2.getWeight();

            if (weight1 < weight2) {
                System.out.println("Вторая коробка тяжелее");
                return -1;
            } else if (weight1 > weight2) {
                System.out.println("Первая коробка тяжелее");
                return 1;
            } else {
                System.out.println("Вес равен ");
                return 0;
            }
        }
    }
