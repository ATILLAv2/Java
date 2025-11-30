package timus;

import java.util.Scanner;

public class t1409 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		int nubOfC = a + b - 1;
		
		int harry = nubOfC - a;
		int larry = nubOfC - b;
		
		System.out.println(harry + " " + larry);

        in.close();

	}

}
