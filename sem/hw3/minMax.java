package sem.hw3;

import java.util.ArrayList;
import java.util.Random;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.
public class minMax {
    public static void main(String[] args) {
        ArrayList<Integer> rndArray = createRndArray();
        System.out.println(rndArray);
        
        System.out.printf("Среднее арифметическое ");
        System.out.println(averageArif(rndArray));

        System.out.printf("Минимальное ");
        System.out.println(minNum(rndArray));

        System.out.printf("Максимальное ");
        System.out.println(maxNum(rndArray));
    }
    private static ArrayList<Integer> createRndArray() {
        ArrayList<Integer> list = new ArrayList<>(5);
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            list.add(rand.nextInt(10));
        }
        return list;
    }
    private static int minNum(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) <= min){
                min = list.get(i);
            }
        }
        return min;
    }
    private static int maxNum(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) >= max){
                max = list.get(i);
            }
        }
        return max;
        
    }
    private static int averageArif(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / list.size();
    }
}
