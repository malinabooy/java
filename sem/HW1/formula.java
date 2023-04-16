package sem.HW1;

import java.util.Scanner;

//Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
//Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
public class formula {
    public static void main(String[] args) {
        //Работает только для уравнений вида ?2 + 5? = 69, где неизвестно 1 и 4 число.
        System.out.println("Работает только для уравнений вида ?2 + 5? = 69, где неизвестно 1 и 4 число.");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите первую цифру: ");
        int numOne = scanner.nextInt();

        System.out.printf("Введите четвертую цифру: ");
        int numFour = scanner.nextInt();

        System.out.printf("Введите чему равно: ");
        int numResult = scanner.nextInt();
        scanner.close();

        // задаем уравнение
        int numTwo, numThree;
  
        // перебираем все возможные значения для numTwo и numThree
        for (numTwo = 0; numTwo <= 9; numTwo++) {
            for (numThree = 0; numThree <= 9; numThree++) {
                // проверяем, является ли numResult равной numTwo + numThree, учитывая знаки вопроса
                //У класса String есть статический метод format(): он позволяет задать шаблон объединения строки с данными.
                String eq = String.format("%d%d + %d%d = %d", numOne, numTwo, numThree, numFour, numResult);
                if (eval(eq)) {
                    System.out.println("Решение: " + eq);
                    return; // найдено решение, выходим из цикла
                }
            }
        }
        
        System.out.println("Решение не найдено");
    }

    // метод для вычисления значения выражения
    public static boolean eval(String expr) {
        String[] parts = expr.split(" ");
        // преобразуем строку в число.
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[2]);
        int z = Integer.parseInt(parts[4]);
        return x + y == z;
    }
}