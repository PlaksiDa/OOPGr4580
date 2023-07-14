package Classes;

import java.io.FileWriter;
import java.io.IOException;

public class LogWriter {
    private static final String LOG_FILE_PATH = "log.txt"; // Путь к файлу лога

    public static void writeLog(String logMessage) {
        try (FileWriter writer = new FileWriter(LOG_FILE_PATH, true)) {
            writer.write(logMessage + System.lineSeparator());
        } catch (IOException e) {
            System.out.println("Ошибка при записи лога: " + e.getMessage());
        }
    }
}