package sem.hw2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//В файле содержится строка с данными:
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.
public class students {
    public static void main(String[] args) {
        parsePrint(readFile());
    }

    private static String readFile() {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("sem/hw2/files/students.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            System.out.print("Error " + e);
        }
        String str = sb.toString();

        return str;
    }

    private static void parsePrint(String str) {
        String[] keys = str.toString().replace("{", "")
                .replace("[", "")
                .replace("]", "")
                .replace("\"", "")
                .replaceAll("\\s", "")
                .split("},");

        Map<String, String> map = new HashMap<>();

        for (String line : keys) {
            String[] student = line.split(",");
            for (String keyValues : student) {
                String[] keyValue = keyValues.replace("}", "").split(":");
                String key = keyValue[0];
                String value = keyValue[1];
                map.put(key, value);
            }
            System.out.printf("Студент %s получил %s по предмету %s.\n", map.get("фамилия"),
            map.get("оценка"), map.get("предмет"));
        }

    }
}
