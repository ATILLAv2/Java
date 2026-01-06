package laba8;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class example12 {
    public static void main(String[] args) {
        try {
            List<String> lines = new ArrayList<>();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("D:\\УрФУ\\Программирование\\Java\\src\\laba8\\input2.txt"), StandardCharsets.UTF_8));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            List<Result> results = soglTest(lines);

            writeResultsToFile(results);

            System.out.println("Данные записаны в файл");
        } catch (IOException e) {
            System.out.println("Ошибка !");
        }
    }
    private static List<Result> soglTest(List<String> lines) {
        List<Result> results = new ArrayList<>();
        String Sogl = "бвгджзйклмнпрстфхцчшщБВГДЖЗЙКЛМНПРСТФХЦЧШЩ";

        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            List<String> wordsWithSogl = new ArrayList<>();

            String[] words = line.split("[\\s\\p{Punct}]+");

            for (String word : words) {
                char firstChar = word.charAt(0);
                if (Sogl.indexOf(firstChar) != -1) {
                    wordsWithSogl.add(word);
                }
            }
            results.add(new Result(i + 1, wordsWithSogl));
        }
        return results;
    }
    private static void writeResultsToFile(List<Result> results) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("D:\\УрФУ\\Программирование\\Java\\src\\laba8\\output2.txt"), StandardCharsets.UTF_8))) {
            for (Result result : results) {
                if (!result.words.isEmpty()) {
                    writer.write("Строка " + result.lineNumber + ": ");
                    writer.write(String.join(", ", result.words));
                    writer.write(" (найдено слов: " + result.words.size() + ")");
                    writer.newLine();
                    System.out.println("Строка " + result.lineNumber + ": " + String.join(
                            ", ", result.words) + " (найдено слов: " + result.words.size() + ")");
                }
            }
        }
    }
    static class Result {
        int lineNumber;
        List<String> words;

        Result(int lineNumber, List<String> words) {
            this.lineNumber = lineNumber;
            this.words = words;
        }
    }
}
