package laba8;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class example10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("D:\\УрФУ\\Программирование\\Java\\MyFile1.txt"), StandardCharsets.UTF_8));
            out = new PrintWriter("D:\\MyFile2.txt", StandardCharsets.UTF_8);
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ": " + s);
            }

        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        }
        finally{
            br.close();
            out.flush();
            out.close();
        }
    }
}

