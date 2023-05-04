package sem.hw5;

import java.util.Arrays;

//Реализовать алгоритм пирамидальной сортировки (HeapSort).
public class HeapSort {

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 };
        int N = arr.length;

        buildHeap(arr, N);
        printHeap(arr, N);
        heapSort(arr, N);
    }

    static void heapify(int arr[], int N, int i) {
        /*
         * Левый дочерний элемент i-го узла имеет (2* i + 1)-й индекс.
         * Правый дочерний элемент i-го узла имеет (2* i + 2)-й индекс.
         */
        int largest = i; // root
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < N && arr[left] > arr[largest])
            largest = left;

        if (right < N && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, N, largest);
        }
    }

    static void buildHeap(int arr[], int N) {
        // последний неконечный узел = узел с индексом
        int startIdx = (N / 2) - 1;
        for (int i = startIdx; i >= 0; i--) {
            heapify(arr, N, i);
        }
    }

    static void printHeap(int arr[], int N) {
        System.out.println("Массив в куче:");

        for (int i = 0; i < N; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    static void heapSort(int arr[], int N) {
        buildHeap(arr, N);
        System.out.println("Отсортированный массив: ");

        for (int i = N - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
        System.out.println(Arrays.toString(arr));

    }
}
