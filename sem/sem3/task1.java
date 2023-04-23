package sem.sem3;
//Заполнить список десятью случайными числами. 
//Отсортировать список методом sort() и вывести его на экран.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task1 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(i, random.nextInt(10));
        }

        System.out.println(numbers);
        numbers.sort(new NumberComparator());

        System.out.println(numbers);
    }
}
