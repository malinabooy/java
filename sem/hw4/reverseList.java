package sem.hw4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class reverseList {

    public static void main(String[] args) {
        List<Integer> list = createRndArray();
        System.out.println(list);

        List<Integer> reversedList = reversed(list);
        System.out.println(reversedList);

        Collections.reverse(list);
        System.out.println(list);
    }

    private static List<Integer> createRndArray() {
        List<Integer> list = new LinkedList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(10));
        }
        return list;
    }

    private static List<Integer> reversed(List<Integer> list) {
        List<Integer> list2 = new LinkedList<>(list);
        List<Integer> revList = new LinkedList<>();

        while (!list2.isEmpty()) {
            revList.add(((LinkedList<Integer>) list2).getLast());
            ((LinkedList<Integer>) list2).removeLast();
        }
        return revList;
    }
}
