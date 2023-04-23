package sem.hw3;

import java.util.ArrayList;
import java.util.Random;

/*
Даны два ArrayList из целых чисел. Написать функции, которые вычисляют разницу коллекций:
Разность:
A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
B - A = все числа из второй коллекции, которые не содержатся в первой
Симметрическая разность:
A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй, которых нет в первой
 */
public class simDiff {
    public static void main(String[] args) {
        ArrayList<Integer> firstArray = createRndArray();
        System.out.println(firstArray);

        ArrayList<Integer> secondArray = createRndArray();
        System.out.println(secondArray);

        ArrayList<Integer> finalArray = joinArray(firstArray, secondArray);
        System.out.println(finalArray);

    }

    private static ArrayList<Integer> createRndArray() {
        ArrayList<Integer> list = new ArrayList<>(7);
        Random rand = new Random();

        for (int i = 0; i < 7; i++) {
            list.add(rand.nextInt(15));
        }

        return list;
    }
    
    private static ArrayList<Integer> joinArray(ArrayList<Integer> first, ArrayList<Integer> second){
        ArrayList<Integer> resultArray = new ArrayList<Integer>();

        for (int i : first) {
            if (!second.contains(i)) {
                resultArray.add(i);
            }
        }

        for (int i : second) {
            if (!first.contains(i)) {
                resultArray.add(i);
            }
        }

        return resultArray;
    }
}
