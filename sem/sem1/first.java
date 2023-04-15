package sem.sem1;


import java.time.LocalTime;
import java.util.Scanner;

//Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
//Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

public class first {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "866");
        System.out.printf("Введите Имя: ");
        String name = iScanner.nextLine();

        LocalTime now = LocalTime.now();

        LocalTime day = LocalTime.of(12, 00, 00);
        LocalTime evening = LocalTime.of(18, 00, 00);
        LocalTime morning = LocalTime.of(05, 00, 00);
        LocalTime night = LocalTime.of(23, 00, 00);

        if (now.compareTo(night)>=0 && now.compareTo(morning)<0){
            System.out.printf("Доброй ночи, %s", name);
        }
        else if (now.compareTo(morning)>=0 && now.compareTo(day)<0){
            System.out.printf("Доброе утро, %s", name);
        }
        else if (now.compareTo(day)>=0 && now.compareTo(evening)<0){
            System.out.printf("Добрый день, %s", name);
        }
        else {
            System.out.printf("Добрый вечер, %s", name);
        }
        iScanner.close();
    }
}
