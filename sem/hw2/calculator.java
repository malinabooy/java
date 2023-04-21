package sem.hw2;

// К калькулятору из предыдущего дз добавить логирование.
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.Level;

public class calculator {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(calculator.class.getName());
        FileHandler fileHandler = new FileHandler("sem/hw2/files/calculator.log");
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        fileHandler.setFormatter(simpleFormatter);
        logger.addHandler(fileHandler);

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int firstNum = scanner.nextInt();
        logger.log(Level.INFO, "Ввели {0}", firstNum);

        System.out.printf("Введите второе число: ");
        int secondNum = scanner.nextInt();
        logger.log(Level.INFO, "Ввели {0}", secondNum);

        System.out.printf(
                "Введите 1 - если нужно сложить\nВведите 2 - если нужно вычесть\nВведите 3 - если нужно умножить\nВведите 4 - если нужно поделить\n");
        int choice = scanner.nextInt();
        logger.log(Level.INFO, "Выбрали {0}", choice);

        scanner.close();
        exeption(firstNum, secondNum, choice);

    }

    private static void exeption(int firstNum, int secondNum, int choice) throws IOException {
        Logger logger = Logger.getLogger(calculator.class.getName());
        try {
            switch (choice) {
                case 1:
                    int sumNum = 0;
                    sumNum = firstNum + secondNum;
                    System.out.print(sumNum);
                    logger.log(Level.INFO, "Ответ {0}", sumNum);
                    break;
                case 2:
                    int substraction = 0;
                    substraction = firstNum - secondNum;
                    logger.log(Level.INFO, "Ответ {0}", substraction);
                    System.out.print(substraction);
                    break;
                case 3:
                    int product = 0;
                    product = firstNum * secondNum;
                    System.out.print(product);
                    logger.log(Level.INFO, "Ответ {0}", product);
                    break;
                case 4:
                    int division = 0;
                    if (secondNum == 0) {
                        System.out.print("Нельзя делить на 0 ");
                    }
                    if (firstNum % secondNum == 1) {
                        division = firstNum / secondNum;
                        System.out.printf(
                                "Результат %s, и какое то число или некоторое количество чисел после запятой\nПростой же калькулятор, попробуй другие числа",
                                division);
                    }

                    else {
                        division = firstNum / secondNum;
                        System.out.print(division);
                    }
                    logger.log(Level.INFO, "Ответ {0}", division);
                    break;
                default:
            }
        } catch (Exception e) {
            logger.log(Level.WARNING, "Что то пошло не так", e);
            System.out.printf("Что то пошло не так " + e);
        }

    }
}
