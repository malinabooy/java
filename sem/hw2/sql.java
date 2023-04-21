package sem.hw2;

//В файле содержится строка с исходными данными в такой форме:
//{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
//SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
//Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class sql {
    public static void main(String[] args) {
        parsePrint(readFile());
    }
    private static String readFile() {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("sem/hw2/files/file.txt"))) {
            String line;
            while ((line = reader.readLine()) !=null) {
                sb.append(line);
            }
        }
        catch(IOException e){
            System.out.print("Error " + e);
        }
        String str = sb.toString();

        return str;
    }
    private static void parsePrint(String str) {
        String str2 = str.replace("{", "")
        .replace("}", "")
        .replace("\"", "");
        String[] newStr = str2.split(", ");
        Map<String,String> dictionary = new HashMap<>();

        for(String line : newStr){
            String[] keyValue = line.split(":");
            String key = keyValue[0];
            String value = keyValue[1];
            dictionary.put(key, value);
        }
        System.out.println(dictionary);
        String name = dictionary.get("name");
        String country = dictionary.get("country");
        String city = dictionary.get("city");
        System.out.printf("SELECT * FROM students WHERE name = %s AND country = %s AND city = %s", name,
                country, city);
    }

}
