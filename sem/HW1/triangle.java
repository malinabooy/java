package sem.HW1;

import java.util.Scanner;

//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class triangle {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int num = scanner.nextInt();
        
        int sumNum = 1;
        int productNum = 1; //product - произведение

        for (int i = 2; i < num+1; i++) {
            System.out.printf("Было %s, прибавили %d\n", sumNum, i);
            sumNum += i;
        }
        System.out.printf("Сумма треугольного числа %s, равна %d",num,sumNum);
        System.out.println("");

        for (int j = 2; j < num+1; j++) {
            System.out.printf("Было %s, умножили на %d\n", productNum, j);
            productNum *= j;
        }
        System.out.printf("Произведение треугольного числа %s, равна %d",num,productNum);
        scanner.close();
    }   
}
