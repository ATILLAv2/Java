package laba8;

import java.io.*;

public class example6 {
    public static void main(String[] args) throws IOException {
        try (Reader in = new FileReader("D:\\УрФУ\\Программирование\\Java\\MyFile1.txt");
             Writer out = new FileWriter("D:\\MyFile2.txt", true)) {
            int oneByte;
            while ((oneByte = in.read()) != -1) {
                out.write((char) oneByte);
                System.out.print((char) oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!! ");
        }
    }
}
