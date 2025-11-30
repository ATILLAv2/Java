package laba2;

import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Введите число: ");

        double n = in.nextDouble();
	        
	        if (n % 3 == 0) {
	            System.out.println("Число " + n + " делится на 3.");
	        } else {
	            System.out.println("Число " + n + " не делится на 3.");
	        }
	}

}
