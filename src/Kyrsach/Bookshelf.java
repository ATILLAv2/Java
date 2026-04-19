package Kyrsach;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

public class Bookshelf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String bookPath = "books/Воскресенье Л.Н. Толстой.txt";

        try {
            BookCipher bookCipher;
            bookCipher = new BookCipher(bookPath);

            System.out.print("\nВведите текст для шифрования: ");
            String text = in.nextLine();

            long startEncrypt = System.nanoTime();
            String encrypted = bookCipher.encrypt(text);
            long endEncrypt = System.nanoTime();
            double encryptTimeMs = (endEncrypt - startEncrypt) / 1_000_000.0;

            System.out.println("\nЗашифрованный текст: " + encrypted);
            System.out.printf("Время шифрования: %.3f мс\n", encryptTimeMs);

            long startDecrypt = System.nanoTime();
            String decrypted = bookCipher.decrypt(encrypted);
            long endDecrypt = System.nanoTime();
            double decryptTimeMs = (endDecrypt - startDecrypt) / 1_000_000.0;

            System.out.println("\nРасшифрованный текст: " + decrypted);
            System.out.printf("Время дешифрования: %.3f мс\n", decryptTimeMs);

        } catch (Exception e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
        in.close();
    }

    public static class BookCipher {
        private String fullText;
        private int charsPerPage = 2000;
        private int charsPerLine = 50;
        private final Random random = new Random();

        public BookCipher(String filePath) throws IOException {
            this(filePath, 2000, 50);
        }

        public BookCipher(String filePath, int charsPerPage, int charsPerLine) throws IOException {
            this.charsPerPage = charsPerPage;
            this.charsPerLine = charsPerLine;
            loadBook(filePath);
        }

        private void loadBook(String filePath) throws IOException {
            Path path = Paths.get(filePath);

            if (!Files.exists(path)) {
                throw new IOException("Файл не найден: " + filePath);
            }

            fullText = Files.readString(path, StandardCharsets.UTF_8);
            fullText = fullText.replace("\r\n", " ").replace("\n", " ").replace("\r", " ");

            System.out.println("Книга загружена, всего символов: " + fullText.length());
        }

        private List<String> findAllChars(char targetChar) {
            List<String> results = new ArrayList<>();
            char searchChar = Character.toLowerCase(targetChar);

            for (int pos = 0; pos < fullText.length(); pos++) {
                char c = Character.toLowerCase(fullText.charAt(pos));
                if (c == searchChar) {
                    int page = pos / charsPerPage + 1;
                    int lineOnPage = (pos % charsPerPage) / charsPerLine + 1;
                    int positionInLine = (pos % charsPerPage) % charsPerLine + 1;
                    results.add("[" + page + "." + lineOnPage + "." + positionInLine + "]");
                }
            }
            return results;
        }

        public String encrypt(String text) {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (Character.isLetter(c)) {
                    List<String> allCords = findAllChars(c);
                    if (!allCords.isEmpty()) {
                        String cord = allCords.get(random.nextInt(allCords.size()));
                        result.append(cord);
                    } else {
                        result.append(c);
                    }
                } else {
                    result.append(c);
                }
                if (i < text.length() - 1) {
                    result.append(" ");
                }
            }
            return result.toString();
        }

        public String decrypt(String cipherText) {
            StringBuilder result = new StringBuilder();
            String[] parts = cipherText.split(" ");

            for (String part : parts) {
                String cleanPart = part.replace("[", "").replace("]", "");
                if (cleanPart.contains(".")) {
                    String[] cords = cleanPart.split("\\.");
                    if (cords.length == 3) {
                        try {
                            int page = Integer.parseInt(cords[0]);
                            int line = Integer.parseInt(cords[1]);
                            int position = Integer.parseInt(cords[2]);

                            int pageStart = (page - 1) * charsPerPage;
                            int lineStart = (line - 1) * charsPerLine;
                            int pos = pageStart + lineStart + (position - 1);

                            if (pos >= 0 && pos < fullText.length()) {
                                result.append(fullText.charAt(pos));
                            } else {
                                result.append('?');
                            }
                        } catch (NumberFormatException e) {
                            result.append(part);
                        }
                    } else {
                        result.append(part);
                    }
                } else {
                    result.append(part);
                }
            }
            return result.toString();
        }
    }
}
