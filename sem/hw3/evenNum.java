package sem.hw3;

import java.util.ArrayList;
import java.util.Random;

//Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
public class evenNum {
    public static void main(String[] args) {
        ArrayList<Integer> rndArray = createRndArray();
        System.out.println(rndArray);
        
        ArrayList<Integer> sortedArray = sortEven(rndArray);
        System.out.println(sortedArray);
    }

    private static ArrayList<Integer> createRndArray() {
        ArrayList<Integer> list = new ArrayList<>(10);
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(10));
        }
        return list;
    }

    private static ArrayList<Integer> sortEven(ArrayList<Integer> list) {
        ArrayList<Integer> evenList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                evenList.add(list.get(i));
            }
        }
        return evenList;
    }

}
