package sem.HW1;
import java.util.Scanner;
//на стадии разработки
//Пользователь вводит уравнение вида q + w = e с использованием символов ? вместо неизвестных цифр.
//Затем программа ищет индексы символов ? и символов q, w и e в строке уравнения.
//Затем программа проверяет каждую комбинацию цифр от 0 до 9 для q, w и e, чтобы увидеть, какие комбинации дают верное уравнение.
//isValidSolution() проверяет, является ли данная комбинация цифр действительным решением
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите уравнение вида q + w = e, используя ? вместо неизвестных: ");
        String equation = input.nextLine();
        input.close();
        
        int questionIndex1 = equation.indexOf('?');
        int questionIndex2 = equation.lastIndexOf('?');
        int qIndex = equation.indexOf('q');
        int wIndex = equation.indexOf('w');
        int eIndex = equation.indexOf('e');
        
        for (int q = 0; q <= 9; q++) {
            for (int w = 0; w <= 9; w++) {
                for (int e = 0; e <= 9; e++) {
                    if (isValidSolution(q, w, e, questionIndex1, questionIndex2, qIndex, wIndex, eIndex, equation)) {
                        System.out.println("Верное решение: q=" + q + ", w=" + w + ", e=" + e);
                    }
                }
            }
        }
        
        System.out.println("Решение не найдено.");
    }
    
    private static boolean isValidSolution(int q, int w, int e, int questionIndex1, int questionIndex2, int qIndex, int wIndex, int eIndex, String equation) {
        if (q == 0 && (qIndex == 0 || questionIndex1 == 0)) {
            return false;
        }
        
        if (w == 0 && (wIndex == 0 || questionIndex1 == wIndex + 1 || questionIndex2 == wIndex + 1)) {
            return false;
        }
        
        if (e == 0 && (eIndex == 0 || questionIndex2 == eIndex + 1)) {
            return false;
        }
        
        String equationToCheck = equation.replace("q", Integer.toString(q));
        equationToCheck = equationToCheck.replace("w", Integer.toString(w));
        equationToCheck = equationToCheck.replace("e", Integer.toString(e));
        
        if (equationToCheck.charAt(questionIndex1) == '?' || equationToCheck.charAt(questionIndex2) == '?') {
            return false;
        }
        
        return evaluateEquation(equationToCheck);
    }
    
    private static boolean evaluateEquation(String equation) {
        String[] operands = equation.split("[+]");
        int sum = 0;
        for (String operand : operands) {
            sum += Integer.parseInt(operand.trim());
        }
        
        return sum == Integer.parseInt(equation.substring(equation.lastIndexOf('=') + 1).trim());
    }
}
    

