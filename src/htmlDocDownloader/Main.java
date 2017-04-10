package htmlDocDownloader;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		HTMLDocDownloader first = new HTMLDocDownloader();
		first.findURL();
		first.connect();
	}
}
