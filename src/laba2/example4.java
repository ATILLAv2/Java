package laba2;

import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Введите число: ");

        double n = in.nextDouble();
	        
		if (n >= 5 && n <= 10) {
            System.out.println("Число " + n + " удовлетворяет условиям");
        } else {
            System.out.println("Число " + n + " не удовлетворяет условиям.");
        }
	}

}
