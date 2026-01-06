package laba8;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class example8 {
    public static void main(String[] args) throws IOException {
        try {
            InputStream inFile	= new FileInputStream("D:\\УрФУ\\Программирование\\Java\\MyFile1.txt");
            Reader rFile = new InputStreamReader(inFile, StandardCharsets.UTF_8);

            readAllByByte(rFile);
            System.out.print("\n\n\n");
            inFile.close();
            rFile.close();

            InputStream inUrl = new URL("http://google.com").openStream();
            Reader   rUrl = new  InputStreamReader(inUrl, StandardCharsets.UTF_8);

            readAllByByte(rUrl);
            System.out.print("\n\n\n");
            inUrl.close();
            rUrl.close();

            InputStream inArray = new ByteArrayInputStream( new byte[] {72, 101, 108, 108, 111});
            Reader rArray = new InputStreamReader(inArray,StandardCharsets.UTF_8 );

            readAllByByte(rArray);
            System.out.print("\n\n\n");
            inArray.close();
            rArray.close();
        }
        catch (IOException e) {
            System.out.println("Ошибка: "+ e);
        }
    }
    public static void readAllByByte(Reader in)	throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + " конец ");
                break;
            }
        }
    }
}
