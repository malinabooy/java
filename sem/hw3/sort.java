package sem.hw3;

import java.util.ArrayList;
import java.util.Random;

//Реализовать алгоритм сортировки слиянием.
public class sort {
    public static void main(String[] args) {
        ArrayList<Integer> rndArray = createRndArray();
        System.out.println("Изначальный лист: " + rndArray);

        mergeSort(rndArray, 0, rndArray.size() - 1);
        System.out.println("Отсортированный лист: " + rndArray);
    }

    private static ArrayList<Integer> createRndArray() {
        ArrayList<Integer> list = new ArrayList<>(15);
        Random rand = new Random();

        for (int i = 0; i < 15; i++) {
            list.add(rand.nextInt(20));
        }
        return list;
    }

    public static void mergeSort(ArrayList<Integer> list, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(list, left, middle);
            mergeSort(list, middle + 1, right);
            merge(list, left, middle, right);
        }
    }

    public static void merge(ArrayList<Integer> list, int left, int middle, int right) {
        ArrayList<Integer> leftArray = new ArrayList<>();
        ArrayList<Integer> rightArray = new ArrayList<>();

        for (int i = left; i <= middle; i++) {
            leftArray.add(list.get(i));
        }

        for (int i = middle + 1; i <= right; i++) {
            rightArray.add(list.get(i));
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < leftArray.size() && j < rightArray.size()) {
            if (leftArray.get(i) <= rightArray.get(j)) {
                list.set(k, leftArray.get(i));
                i++;
            } else {
                list.set(k, rightArray.get(j));
                j++;
            }
            k++;
        }

        while (i < leftArray.size()) {
            list.set(k, leftArray.get(i));
            i++;
            k++;
        }

        while (j < rightArray.size()) {
            list.set(k, rightArray.get(j));
            j++;
            k++;
        }

    }
}
