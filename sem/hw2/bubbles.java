package sem.hw2;

import java.io.IOException;
import java.util.logging.Level;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class bubbles {
    public static void main(String[] args) throws IOException {
        printArray(bubblesSort(createRndArray()));
    }
    private static int[] createRndArray() {
        Random rand = new Random();
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        return arr;
    }
    public static int[] bubblesSort(int[] arr) throws IOException {
        Logger logger = Logger.getLogger(bubbles.class.getName());
        try {
        FileHandler fileHandler = new FileHandler("sem/hw2/files/bubbles.log");
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        fileHandler.setFormatter(simpleFormatter);
        logger.addHandler(fileHandler);
    
        int i = 0;
        boolean flag = true;
        while (i < arr.length - 1) {
            flag = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    logger.log(Level.INFO, "Перенесли {0}", temp);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
            i++;
        }
        } catch (Exception e) {
            logger.log(Level.WARNING, "Что то пошло не так", e);
            System.out.printf("Что то пошло не так " + e);
        }
        return arr;

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }

}