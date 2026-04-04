package laba10;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class ParExcelUpd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            try {
                read();
                break;
            } catch (Exception e) {
                System.out.println("\nОшибка: " + e.getMessage());
                System.out.println("Совет: " + Advice(e));
                System.out.print("Повторить? (1-да, 2-нет): ");
                if (in.nextInt() != 1) break;
            }
        }
        in.close();
    }

    private static void read() throws Exception {
        File file = new File("src/laba10/example3.xlsx");

        if (!file.exists()) throw new Exception("Файл не найден");
        if (!file.canRead()) throw new Exception("Нет прав на чтение");

        try (FileInputStream input = new FileInputStream(file);
             Workbook workbook = new XSSFWorkbook(input)) {

            Sheet sheet = workbook.getSheet("Товары");
            if (sheet == null) throw new Exception("Лист Товары не найден");
            if (sheet.getPhysicalNumberOfRows() == 0) throw new Exception("Лист пуст");

            for (Row row : sheet) {
                if (row == null) continue;
                for (Cell cell : row) {
                    System.out.print(getCell(cell) + "\t");
                }
                System.out.println();
            }
        }
    }

    private static String getCell(Cell cell) {
        if (cell == null) return "";
        return switch (cell.getCellType()) {
            case STRING -> cell.getStringCellValue();
            case NUMERIC -> String.valueOf((long) cell.getNumericCellValue());
            default -> "";
        };
    }

    private static String Advice(Exception e) {
        String msg = e.getMessage();
        if (msg.contains("Файл не найден")) return "Создайте файл Excel";
        if (msg.contains("Лист")) return "Проверьте имя листа";
        if (msg.contains("пуст")) return "Добавьте данные в файл";
        return "Проверьте путь к файлу";
    }
}
