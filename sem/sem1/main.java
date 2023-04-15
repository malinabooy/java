package sem.sem1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class main {
    public static void hello (String[] args) {
        System.out.println("Hello World");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY HH:mm:ss");
        System.out.println(formatter.format(now));
        //LocalDateTime
        //LocalDate
        //LocalTime
    }
}
