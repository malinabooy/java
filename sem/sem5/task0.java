package sem.sem5;

import java.util.HashMap;
import java.util.Map;

public class task0 {
    public static void main(String[] args) {
        Map<Integer, String> passportToLastName = new HashMap<>();
        passportToLastName.put(123456, "Иванов");
        passportToLastName.put(321456, "Васильев");
        passportToLastName.put(234561, "Петрова");
        passportToLastName.put(234432, "Иванов");
        passportToLastName.put(654321, "Петрова");
        passportToLastName.put(345678, "Иванов");

        System.out.println(passportToLastName);

        for (Map.Entry<Integer, String> pair : passportToLastName.entrySet()) {
            if (pair.getValue().equals("Иванов"))
                System.out.println(pair);
        }
    }
}
