package sem.hw4;
/*
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя.
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class queue {
    public static void main(String[] args) {

        List<Integer> list = createRndArray();
        System.out.println(list);

        List<Integer> list2 = enqueue(list);
        System.out.println(list2);

        dequeue(list);

        first(list);

       // List<Integer> list4 = first(list);
        //System.out.println(list4);
    }
    
    private static List<Integer> createRndArray() {
        List<Integer> list = new LinkedList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(10));
        }
        return list;
    }

    private static List<Integer> enqueue(List<Integer> list) {
        List<Integer> list2 = new LinkedList<>(list);
        List<Integer> enqueueList = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        int input = scanner.nextInt();
        

        for (int i = 0; i < list2.size() + 1; i++) {
            if(i < list2.size()){
                enqueueList.add(list2.get(i));
            }
            else enqueueList.add(input);
        }
        scanner.close();
        return enqueueList;
    }

    private static void dequeue(List<Integer> list) {
        List<Integer> list3 = new LinkedList<>(list);
        
        System.out.println(list3.get(0));
        list3.remove(0);
        System.out.println(list3);
    }

    private static void first(List<Integer> list) {
        List<Integer> list4 = new LinkedList<>(list);
        System.out.println(list4.get(0));
    }
}
