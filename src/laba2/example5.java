package laba2;

import java.util.Scanner;

public class example5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Введите число: ");
		
		int n = in.nextInt();
	        
        int thousands = n / 1000;
	        
	        System.out.println("В числе " + n + " содержится " + thousands + " тысяч(и).");
	}

}
