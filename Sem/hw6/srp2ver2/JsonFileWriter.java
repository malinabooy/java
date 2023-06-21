package Sem.hw6.srp2ver2;

import java.io.FileWriter;
import java.io.IOException;

public class JsonFileWriter {
    public void writeJsonToFile(JsonSerializable object, String fileName) {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write(object.toJson());
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
