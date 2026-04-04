package laba10;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ParExcel {
    public static void main(String[] args) throws IOException {
        // Создаем новую книгу Excel
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Создаем новый лист в книге
        XSSFSheet sheet = workbook.createSheet("Товары");

        // Записываем данные в ячейки
        Row headerRow = sheet.createRow(0 );
        headerRow.createCell( 0 ).setCellValue("Товар");
        headerRow.createCell( 1 ).setCellValue("Характеристики");
        headerRow.createCell( 2 ).setCellValue("Стоимость");

        Row dataRow1 = sheet.createRow(1 );
        dataRow1.createCell( 0 ).setCellValue("Книга");
        dataRow1.createCell( 1 ).setCellValue("Жанр: Фантастика, Автор: Иванов И.И.");
        dataRow1.createCell( 2 ).setCellValue(500.0);

        Row dataRow2 = sheet.createRow(2 );
        dataRow2.createCell( 0 ).setCellValue("Компьютер");
        dataRow2.createCell( 1 ).setCellValue("Процессор: Intel Core i5, Оперативная память");
        dataRow2.createCell( 2 ).setCellValue(25000.0);

        // Записываем книгу Excel в файл
        String filePath = "src/laba10/example3.xlsx";
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("Данные записаны в файл: " + filePath);

        // Открываем файл Excel для чтения
        FileInputStream inputStream = new FileInputStream(filePath);

        // Создаем экземпляр книги Excel из файла
        XSSFWorkbook workbook1 = new XSSFWorkbook(inputStream);

        // Получаем лист из книги по его имени
        XSSFSheet sheet1 = workbook1.getSheet("Товары");

        // Перебираем строки и ячейки листа
        for (Row row : sheet1) {
            for (Cell cell : row) {
                // Выводим значение ячейки на экран
                System.out.print(cell.toString() + "\t");
            }
            System.out.println();
        }
        // Закрываем файл и освобождаем ресурсы
        workbook.close();
        inputStream.close();
    }
}
