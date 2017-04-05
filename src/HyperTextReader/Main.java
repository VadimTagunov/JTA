package HyperTextReader;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		textReader tr = new textReader();
		tr.readFromFile();
		tr.findTheUrl();
	}
}
