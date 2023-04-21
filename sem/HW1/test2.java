package sem.HW1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //Работает только для уравнений вида ?2 + 5? = 69, где неизвестно 1 и 4 число.
        Scanner input = new Scanner(System.in);
        System.out.print("Введите уравнение вида qw + er = ty, используя ? вместо неизвестных: ");
        String [] sb = new String[11];
        input.close();

        List<String> queSb = new ArrayList<String>();
        List<String> numList = new ArrayList<String>();

        //отсеиваем лишнее и запоминаем индексы "?"
        for (int i = 0; i < sb.length; i++) {
            if(sb[i] == "+" && sb[i] == "="){
                i++;
            }
            else if(sb[i] == "?"){
                int queIndex = i;
                String question = Integer.toString(queIndex);
                queSb.add(question);
            }
            else{
                numList.add(sb[i]);
            }
        }

        int numOne, numTwo, numThree, numFour, numResultOne, numResultTwo;

        // перебираем все возможные значения
        for (numOne = 0; numOne <= 9; numOne++) {
            for (numTwo = 0; numTwo <= 9; numTwo++) {
                for (numThree = 0; numThree <= 9; numThree++) {
                    for (numFour = 0; numFour <= 9; numFour++) {
                        for (numResultOne = 0; numResultOne <= 9; numResultOne++) {
                            for (numResultTwo = 0; numResultTwo <= 9; numResultTwo++) {
                                // проверяем, является ли numResult равной numTwo + numThree, учитывая знаки вопроса
                                //У класса String есть статический метод format(): он позволяет задать шаблон объединения строки с данными.
                                String eq = String.format("%d%d + %d%d = %d%d", numOne, numTwo, numThree, numFour, numResultOne, numResultTwo);
                                if (eval(eq)) {
                                    System.out.println("Решение: " + eq);
                                    return; // найдено решение, выходим из цикла
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Решение не найдено");
    }

    // метод для вычисления значения выражения
    public static boolean eval(String expr) {
        String[] parts = expr.split(" ");
        
        // преобразуем строку в число.
        int q = Integer.parseInt(parts[0]);
        //int w = Integer.parseInt(parts[1]);
        //int e = Integer.parseInt(parts[2]);
        int r = Integer.parseInt(parts[3]);
        //int t = Integer.parseInt(parts[4]);
        int y = Integer.parseInt(parts[5]);


        return q + r == y;
    }
}
