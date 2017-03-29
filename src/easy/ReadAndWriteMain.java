package easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndWriteMain {

	public static void main(String[] args) {
		ReadAndWrite test1 = new ReadAndWrite("E:\\java\\text.txt");
		ReadAndWrite test2 = new ReadAndWrite("E:\\java\\text2.txt");
		
		test1.ReadFile();
		test2.ReadFile();
	}
}
