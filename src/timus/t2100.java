package timus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class t2100 {

	public static void main(String[] args) {
		
		String inputFileName = "src/timus/input";
		boolean oj = System.getProperty("ONLINE_JUDGE") != null;
		int MandL = 2;
		
		try {
			
			BufferedReader bufferedReader =
					oj ? new BufferedReader(new InputStreamReader(System.in)) :
						new BufferedReader(new FileReader(inputFileName));
			
			String readLine = "";
			
			int numberOfF = 0;
			int numberOfP =0;
			
			while ((readLine = bufferedReader.readLine()) != null) {
				if(numberOfF == 0) {
					numberOfF = Integer.parseInt(readLine);
					continue;
				}
				if(readLine.contains("+")) {
					numberOfP++;
				}
			}
			
			int result;
			int guests = (MandL + numberOfF + numberOfP);
			if(guests == 13) {
				result = (guests * 100) + 100;
			} else {
				result = guests * 100;
			}
			
			System.out.println(result);
		} catch (IOException exception) {
			exception.printStackTrace();
		}

	}

}
