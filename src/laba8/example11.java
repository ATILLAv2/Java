package laba8;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class example11 {
    public static void main(String[] args)  {
        try {
            List<String> lines = new ArrayList<>();
            List<Double> numbers = new ArrayList<>();
            List<String> resultLines = new ArrayList<>();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("D:\\УрФУ\\Программирование\\Java\\src\\laba8\\input.txt"), StandardCharsets.UTF_8));

            for (int i = 0; i < 2; i++) {
                String line = reader.readLine();
                if (line != null) {
                    lines.add(line);
                }
            }
            for (int i = 0; i < 5; i++) {
                String numberLine = reader.readLine();
                double num = Double.parseDouble(numberLine.trim());
                numbers.add(num);
            }
            resultLines.add(lines.get(1));

            for (Double num : numbers) {
                if (num > 0) {
                    resultLines.add(num.toString());
                }
            }

            writeDataToFile(resultLines);
            System.out.println("Данные записаны в файл");
        } catch (IOException e) {
            System.out.println("Ошибка !");
        }
    }
    private static void writeDataToFile(List<String> data) throws IOException {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("D:\\УрФУ\\Программирование\\Java\\src\\laba8\\output.txt"), StandardCharsets.UTF_8));
            for (String line : data) {
                writer.write(line);
                System.out.println(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        }
        finally{
            writer.flush();
            writer.close();
        }
    }
}

