package laba2;

import java.util.Scanner;

public class example3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Введите число: ");

        double n = in.nextDouble();
	        
		if (n % 4 == 0 && n > 10) {
            System.out.println("Число " + n + " удовлетворяет условиям");
        } else {
            System.out.println("Число " + n + " не удовлетворяет условиям.");
        }
	}

}
