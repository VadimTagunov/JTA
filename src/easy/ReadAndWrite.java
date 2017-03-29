package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndWrite {
	private static String FILENAME = null;
	
	public ReadAndWrite(String address) {
		FILENAME = address;
	}
		
	public static void ReadFile() {	
	try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} 	catch (IOException e) {
			e.printStackTrace();
		}
	}
}

