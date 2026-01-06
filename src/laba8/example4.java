package laba8;

import java.io.*;
import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        try {
            File f1 = new File("D:\\numIsh.txt");
            f1.createNewFile();

            Scanner sc = new Scanner(System.in);

            DataOutputStream wr = new DataOutputStream(
                    new FileOutputStream(f1.getAbsolutePath()));
            System.out.println("Сколько вещественных чисел записать в файл?");
            int count = sc.nextInt();
            System.out.println("Введите числа:");
            for (int i = 0; i < count; i++) {
                wr.writeFloat(sc.nextFloat());
            }
            wr.flush();
            wr.close();
            File f2 = new File("D:\\numRez.txt");
            f2.createNewFile();

            DataInputStream rd = new DataInputStream(
                    new FileInputStream(f1.getAbsolutePath()));
            wr = new DataOutputStream(
                    new FileOutputStream(f2.getAbsolutePath()));

            try {
                while (true) {
                    float number = rd.readFloat();
                    wr.writeFloat(number);

                    System.out.println(" Число " + number);
                }
            } catch (EOFException e) {
            }
            wr.flush();
            wr.close();
            rd.close();
        } catch (IOException e) {
            System.out.println("End of file");
        }
    }
}
