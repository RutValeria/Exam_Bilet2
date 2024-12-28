import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Bilet2 {
    public static void main(String[] args) {
        String filePath = "C:/Users/217555/Downloads/textfile.txt";
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            int totalLines = lines.size();
            System.out.println("Общее количество строк: " + totalLines);
            int maxLength = 0;
            for (String line : lines) {
                maxLength = Math.max(maxLength, line.length());
            }
            System.out.println("Самые длинные строки:");
            for (String line : lines) {
                if (line.length() == maxLength) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}

