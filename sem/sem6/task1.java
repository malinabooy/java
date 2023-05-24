package sem.sem6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными числами от 0 до 24. 
2. Создайте метод, в который передайте заполненный выше массив, и с помощью Set вычислите процент уникальных значений 
в данном массиве, и верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
 */
public class task1 {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        initArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(getUniqPercent(arr));
    }

    private static void initArray(int[] arr) {
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(25);
        }
    }

    private static float getUniqPercent(int[] arr) {
        Set<Integer> uniq = new HashSet<>();

        for (int i : arr) {
            uniq.add(i);
        }

        return 100.0f * uniq.size() / arr.length;
    }
}
