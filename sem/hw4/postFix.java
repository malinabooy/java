package sem.hw4;

import java.util.Scanner;
import java.util.Stack;

/*
 Напишите постфиксный калькулятор. Пользователь вводит данные и операции в обратной польской записи. 
 Калькулятор вычисляет результат и проверяет, что в стэке получилось единственное число.
Например:
5 4 3 - + => 5 1 + => 6
 */
public class postFix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Введите строку: ");
        String input = scanner.nextLine();

        String[] tokens = input.split("\\s+");
        for (String token : tokens) {
            if (token.matches("\\d+")) {
                stack.push(Integer.parseInt(token));
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = evaluate(token, operand1, operand2);
                stack.push(result);
            }
        }

        if (stack.size() != 1) {
            System.out.println("Ошибка");
        } else {
            System.out.println(stack.pop());
        }
        scanner.close();
    }

    private static int evaluate(String operator, int operand1, int operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Ошибка: " + operator);
        }
    }
}
