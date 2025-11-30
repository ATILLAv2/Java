package timus;

import java.util.Scanner;

public class t1180 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        String in = scanner.next();
        
        int sum = 0;
        for (int i = 0; i < in.length(); i++) {
            sum += in.charAt(i);
        }

        if (sum % 3 == 0) {
            System.out.println(2);
        } else {
            System.out.println(1);
            if (sum % 3 == 1) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
        
        scanner.close();

	}

}
