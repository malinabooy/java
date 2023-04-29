package sem.sem4;
/* 
  Реализовать консольное приложение, которое в цикле:
Принимает от пользователя строку вида 
text~num
Нужно разделить строку по ~, сохранить text в связный список на позицию num.
Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
*/

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "866");
        
        List<String> inputList = new LinkedList<>();


        String[] str = new String[2];

        while (true){
            System.out.println("Введите строку: ");
            String input = scanner.nextLine();
            if(input.equals("")) break;

            if(input.contains("~")){
                str = input.split("~");
                int num = Integer.parseInt(str[1]);
                if(str[0].equals("print")){
                    if(num >= 0 && num < inputList.size()){
                        System.out.println(inputList.get(num));
                        inputList.remove(num);
                        System.out.println(inputList);
                    }
                    else System.out.println("Error");
                }
                else{
                    if(num > inputList.size()){
                        System.out.println("Введен слишком большой индекс, будет добавлен в конец ");
                        num = inputList.size();
                    }
                    if(num < inputList.size()){
                        System.out.println("Введен отрицательный индекс, будет добавлен в начало ");
                        num = 0;
                    }
                    inputList.add(num, str[0]);
                    System.out.println(inputList);
                }
            }
            else System.out.println("Error");
        }
        scanner.close();     
    }
}
