package sem.sem2;

import java.io.FileWriter;
import java.io.IOException;

//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, 
//который запишет эту строку в простой текстовый файл, обработайте исключения
public class four {
    public static void main(String[] args) {
        int count = 100;
        String str = " TEST ";
        try {
            saveFile(testString(str, count));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static String testString(String str, int count){
        StringBuilder test = new StringBuilder();

        for (int i = 0; i < count; i++) {
            test.append(str);
        }
        return test.toString();
    }
    private static void saveFile(String str) throws IOException {
        FileWriter file = null;
        try {
            file = new FileWriter("file.txt");
            file.write(str);
        } 
        catch (IOException e) {
            System.out.println("Проблема вывода!");
            e.printStackTrace();
        }
        finally{
            if(file!=null){
                file.close();
            }

        }
    }
    
}
