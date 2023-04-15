package sem.HW1;

import java.util.Scanner;

public class calculator {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int firstNum = scanner.nextInt();

        System.out.printf("Введите второе число: ");
        int secondNum = scanner.nextInt();

        System.out.printf("Введите 1 - если нужно сложить\nВведите 2 - если нужно вычесть\nВведите 3 - если нужно умножить\nВведите 4 - если нужно поделить\n");
        int choice = scanner.nextInt();


        switch (choice){
            case 1: 
                int sumNum = 0;
                sumNum = firstNum + secondNum; 
                System.out.print(sumNum);
                break;
            case 2:
                int substraction = 0;
                substraction = firstNum - secondNum;
                System.out.print(substraction);
                break;
            case 3: 
                int product = 0;
                product = firstNum * secondNum; 
                System.out.print(product);
                break;
            case 4:
                int division = 0;
                if(firstNum % secondNum == 1){
                    division = firstNum / secondNum;
                    System.out.printf("Результат %s, и какое то число или некоторое количество чисел после запятой\nПростой же калькулятор, попробуй другие числа", division );
                }
                
                else{
                    division = firstNum / secondNum;
                    System.out.print(division);
                }
                break;
            default:
        }
        scanner.close();

    }
}
