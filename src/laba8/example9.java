package laba8;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class example9 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = null;
        BufferedWriter bw=null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                        new FileInputStream("D:\\УрФУ\\Программирование\\Java\\MyFile1.txt"), StandardCharsets.UTF_8));
            bw = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("D:\\MyFile2.txt"),StandardCharsets.UTF_8));
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null){
                lineCount++;
                System.out.println(lineCount + ": " + s);
                bw.write(lineCount + ": " + s);
                bw.newLine();
                }
            } catch (IOException e) { System.out.println("Ошибка!!!!!!!!");
        }
        finally{
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
